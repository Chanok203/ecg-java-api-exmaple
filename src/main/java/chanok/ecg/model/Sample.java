/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanok.ecg.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 *
 * @author Chanok Pathompatai <pathompatai_c@silpakorn.edu>
 */
public class Sample {
    
    // Property
    
    @JsonProperty("start_time")
    private int start_time;
    
    @JsonProperty("end_time")
    private int end_time;
    
    @JsonProperty("confidence_af")
    private double confidence_af;
    
    @JsonProperty("confidence_lbbb")
    private double confidence_lbbb;
    
    @JsonProperty("has_af")
    private boolean has_af;
    
    @JsonProperty("has_lbbb")
    private boolean has_lbbb;
    
    // Getter
    
    @JsonGetter("start_time")
    public int getStartTime() {
        return this.start_time;
    }
    
    @JsonGetter("end_time")
    public int getEndTime() {
        return this.end_time;
    }
    
    @JsonGetter("confidence_af")
    public double getConfidenceAF() {
        return this.confidence_af;
    }
    
    @JsonGetter("confidence_lbbb")
    public double getConfidenceLBBB() {
        return this.confidence_lbbb;
    }
    
    @JsonGetter("has_lbbb")
    public boolean getHasLBBB() {
        return this.has_lbbb;
    }
    
    @JsonGetter("has_af")
    public boolean getHasAF() {
        return this.has_af;
    }
    
    
    // Setter

    @JsonSetter("start_time")
    public void setStartTime(int start_time) {
        this.start_time = start_time;
    }
    
    @JsonSetter("end_time")
    public void setEndTime(int end_time) {
        this.end_time = end_time;
    }
    
    @JsonSetter("confidence_af")
    public void setConfidenceAF(double confidence_af) {
        this.confidence_af = confidence_af;
    }
    
    @JsonSetter("confidence_lbbb")
    public void setConfidenceLBBB(double confidence_lbbb) {
        this.confidence_lbbb = confidence_lbbb;
    }
    
    @JsonSetter("has_lbbb")
    public void setHasLBBB(boolean has_lbbb) {
        this.has_lbbb = has_lbbb;
    }
    
    @JsonSetter("has_af")
    public void getHasAF(boolean has_af) {
        this.has_af = has_af;
    }
    
}
