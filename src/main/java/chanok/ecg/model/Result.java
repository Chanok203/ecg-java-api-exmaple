/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    // Found_AFib
    @JsonProperty("Found_AFib")
    private int Found_AFib;

    @JsonGetter("Found_AFib")
    public int getFoundAFib() {
        return this.Found_AFib;
    }

    @JsonSetter("Found_AFib")
    public void setFoundAFib(int Found_AFib) {
        this.Found_AFib = Found_AFib;
    }

    // Found_LBBB
    @JsonProperty("Found_LBBB")
    private int Found_LBBB;

    @JsonGetter("Found_LBBB")
    public int getFoundLBBB() {
        return this.Found_LBBB;
    }

    @JsonSetter("Found_LBBB")
    public void setFoundLBBB(int Found_LBBB) {
        this.Found_LBBB = Found_LBBB;
    }

    // AFib_start_at
    @JsonProperty("AFib_start_at")
    private List<Integer> AFib_start_at;

    @JsonGetter("AFib_start_at")
    public List<Integer> getAFibStartAt() {
        return this.AFib_start_at;
    }

    @JsonSetter("AFib_start_at")
    public void setAFibStartAt(List<Integer> AFib_start_at) {
        this.AFib_start_at = AFib_start_at;
    }

    // LBBB_start_at
    @JsonProperty("LBBB_start_at")
    private List<Integer> LBBB_start_at;

    @JsonGetter("LBBB_start_at")
    public List<Integer> getLBBBStartAt() {
        return this.LBBB_start_at;
    }

    @JsonSetter("LBBB_start_at")
    public void setLBBBStartAt(List<Integer> LBBB_start_at) {
        this.LBBB_start_at = LBBB_start_at;
    }

    // Contructor
    public Result() {
    }

}
