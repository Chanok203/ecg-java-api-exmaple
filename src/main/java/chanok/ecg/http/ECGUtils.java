
package chanok.ecg.http;

import chanok.ecg.model.Result;
import chanok.ecg.model.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class ECGUtils {

    String host;
    private final ObjectMapper mapper;

    public ECGUtils(String host) {
        this.mapper = new ObjectMapper();
        this.host = host;
    }

    public String getJsonFromObject(Object obj) throws Exception {
        return this.mapper.writeValueAsString(obj);
    }
    
    public Object getObjectFromJson(String jsonString, Class cls) throws Exception {
        return this.mapper.readValue(jsonString, cls);
    }
    
    public Result getResultAsObject(String jsonString) throws Exception {
        String urlString = this.host + "/api/";
        URL url = new URL(urlString);
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();

        // Setting Headers
        httpCon.setRequestMethod("POST");
        httpCon.setRequestProperty("Content-Type", "application/json; utf-8");
        httpCon.setRequestProperty("Accept", "application/json");
        httpCon.setDoOutput(true);

        // Write Body
        OutputStream os = httpCon.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
        osw.write(jsonString);
        osw.flush();
        osw.close();
        os.close();

        // Seng Request
        httpCon.connect();
        
        // Handler Response
        BufferedReader br = new BufferedReader(new InputStreamReader(httpCon.getInputStream()));
        String line;
        StringBuffer sb = new StringBuffer();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return (Result) this.getObjectFromJson(new String(sb), Result.class);
    }

}
