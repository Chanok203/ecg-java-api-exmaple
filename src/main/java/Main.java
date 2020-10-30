
import chanok.ecg.http.ECGUtils;
import chanok.ecg.model.Result;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.process();
    }
    
    private void process() throws Exception {
        String host = "http://localhost:5000";
        ECGUtils ecgUtils = new ECGUtils(host);
        
        Result result = ecgUtils.getResult();
        System.out.println(result);
        
    }
}
