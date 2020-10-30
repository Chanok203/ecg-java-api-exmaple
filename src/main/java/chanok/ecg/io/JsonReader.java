
package chanok.ecg.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class JsonReader {
    
    public String read(String filepath) throws Exception {
        File file = new File(filepath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return new String(sb);
    }
    
}
