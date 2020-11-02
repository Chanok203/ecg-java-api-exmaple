package chanok.ecg.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Result {

    // count_af
    @JsonProperty("count_af")
    private int count_af;

    @JsonGetter("count_af")
    public int getCountAF() {
        return this.count_af;
    }

    @JsonSetter("count_af")
    public void setCountAF(int count_af) {
        this.count_af = count_af;
    }

    // count_lbbb
    @JsonProperty("count_lbbb")
    private int count_lbbb;

    @JsonGetter("count_lbbb")
    public int getCountLBBB() {
        return this.count_lbbb;
    }

    @JsonSetter("count_lbbb")
    public void setCountLBBB(int count_lbbb) {
        this.count_lbbb = count_lbbb;
    }

    // af_th
    @JsonProperty("af_th")
    private double af_th;

    @JsonGetter("af_th")
    public double getAFTh() {
        return this.af_th;
    }

    @JsonSetter("af_th")
    public void setAFTh() {
        this.af_th = af_th;
    }

    // lbbb_th
    @JsonProperty("lbbb_th")
    private double lbbb_th;

    @JsonGetter("lbbb_th")
    public double getLBBBTh() {
        return this.lbbb_th;
    }

    @JsonSetter("lbbb_th")
    public void setLBBBTh() {
        this.lbbb_th = lbbb_th;
    }

    // result
    @JsonProperty("result")
    List<Sample> result;

    @JsonGetter("result")
    public List<Sample> getResult() {
        return this.result;
    }

    @JsonSetter("result")
    public void setResult(List<Sample> result) {
        this.result = result;
    }

}
