
package com.techprimers.springboot.bean;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ytdWages",
    "customFMV",
    "proratedGain",
    "taxDescription",
    "ytdPaid",
    "fmv"
})
public class Tax {

    @JsonProperty("ytdWages")
    private String ytdWages;
    @JsonProperty("customFMV")
    private String customFMV;
    @JsonProperty("proratedGain")
    private String proratedGain;
    @JsonProperty("taxDescription")
    private String taxDescription;
    @JsonProperty("ytdPaid")
    private String ytdPaid;
    @JsonProperty("fmv")
    private String fmv;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ytdWages")
    public String getYtdWages() {
        return ytdWages;
    }

    @JsonProperty("ytdWages")
    public void setYtdWages(String ytdWages) {
        this.ytdWages = ytdWages;
    }

    @JsonProperty("customFMV")
    public String getCustomFMV() {
        return customFMV;
    }

    @JsonProperty("customFMV")
    public void setCustomFMV(String customFMV) {
        this.customFMV = customFMV;
    }

    @JsonProperty("proratedGain")
    public String getProratedGain() {
        return proratedGain;
    }

    @JsonProperty("proratedGain")
    public void setProratedGain(String proratedGain) {
        this.proratedGain = proratedGain;
    }

    @JsonProperty("taxDescription")
    public String getTaxDescription() {
        return taxDescription;
    }

    @JsonProperty("taxDescription")
    public void setTaxDescription(String taxDescription) {
        this.taxDescription = taxDescription;
    }

    @JsonProperty("ytdPaid")
    public String getYtdPaid() {
        return ytdPaid;
    }

    @JsonProperty("ytdPaid")
    public void setYtdPaid(String ytdPaid) {
        this.ytdPaid = ytdPaid;
    }

    @JsonProperty("fmv")
    public String getFmv() {
        return fmv;
    }

    @JsonProperty("fmv")
    public void setFmv(String fmv) {
        this.fmv = fmv;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
