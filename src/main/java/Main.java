

import chanok.ecg.http.ECGUtils;
import chanok.ecg.io.JsonReader;
import chanok.ecg.model.Data;
import chanok.ecg.model.Result;
import chanok.ecg.model.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Main {

    public static void main(String[] args) throws Exception {
        new Main().process();
    }

    private void process() throws Exception {
//        String host = "http://172.27.104.139:5000";
//        String host = "http://localhost:5000";
        String host = "http://44.225.195.38:8004";
        ECGUtils ecgUtils = new ECGUtils(host);

        // Extract JSON File
        String filepath = "src/main/java/chanok/ecg/example/lead II test data-Sep-30-2020.json";
        String raw = new JsonReader().read(filepath);
        Pattern pattern = Pattern.compile("\\[(.*)]");
        Matcher matcher = pattern.matcher(raw);
        List<Integer> signal = new ArrayList();
        if (matcher.find()) {
            String[] signalString = matcher.group(1).replace(" ", "").split(",");
            for (String x:signalString) {
                signal.add(Integer.parseInt(x));
            }
        }
        
        // Create Data Object
        Data data = new Data();
        data.setSignal(signal);
        data.setFS(125);
        
        // Convert Data Object to JSON String (Body)
        String jsonString = ecgUtils.getJsonFromObject(data);
        
        // Send Request
        Result result = ecgUtils.getResultAsObject(jsonString);
        
        // Visualize 
        // - Convert an Object to String (JSON)
        String resultString = ecgUtils.getJsonFromObject(result);
        System.out.println(resultString);
    }
}
