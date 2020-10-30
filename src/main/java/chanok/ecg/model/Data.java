package chanok.ecg.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Data {

    // fs
    @JsonProperty("fs")
    private int fs;

    @JsonGetter("fs")
    public int getFS() {
        return this.fs;
    }

    @JsonSetter("fs")
    public void setFS(int fs) {
        this.fs = fs;
    }

    // signal
    @JsonProperty("signal")
    private List<Integer> signal;

    @JsonGetter("signal")
    public List<Integer> getSignal() {
        return this.signal;
    }

    @JsonSetter("signal")
    public void setSignal(List<Integer> signal) {
        this.signal = signal;
    }

    // Constructor
    public Data() {
    }

}
