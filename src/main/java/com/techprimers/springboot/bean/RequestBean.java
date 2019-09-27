
package com.techprimers.springboot.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "includeSuccessRecords"
})
public class RequestBean {

	@ApiModelProperty(notes = "Data presention",name="data",required=true,value="Arrays of data.")
    @JsonProperty("data")
    private List<Datum> data = null;
	
	@ApiModelProperty(notes = "Success Records info",name="includeSuccessRecords",required=true,value="Include Success data.")
    @JsonProperty("includeSuccessRecords")
    private String includeSuccessRecords;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

    @JsonProperty("includeSuccessRecords")
    public String getIncludeSuccessRecords() {
        return includeSuccessRecords;
    }

    @JsonProperty("includeSuccessRecords")
    public void setIncludeSuccessRecords(String includeSuccessRecords) {
        this.includeSuccessRecords = includeSuccessRecords;
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
