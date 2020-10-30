/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanok.ecg.http;

import chanok.ecg.model.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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

    public Result getResult() throws Exception {
        String urlString = this.host + "/";
        URL url = new URL(urlString);
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();

        // TODO: Change method to "POST" and add BODY (JSON)
        httpCon.setRequestMethod("GET");

        httpCon.connect();
        BufferedReader br = new BufferedReader(new InputStreamReader(httpCon.getInputStream()));
        String line;
        StringBuffer sb = new StringBuffer();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        String jsonString = new String(sb);
        return this.mapper.readValue(jsonString, Result.class);
    }

}
