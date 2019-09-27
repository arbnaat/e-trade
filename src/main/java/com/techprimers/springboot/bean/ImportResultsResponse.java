package com.techprimers.springboot.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportResultsResponse {
	
	 @JsonProperty("totalRecordsCount")
	 private Integer totalRecordsCount;
	 
	 @JsonProperty("totalRecordsWithWarningCount")
	 private Integer totalRecordsWithWarningCount;
	 
	 @JsonProperty("totalRecordsWithFormattingError")
	 private Integer totalRecordsWithFormattingError;
	 
	 @JsonProperty("totalRecordsWithoutFormattingError")
	 private Integer totalRecordsWithoutFormattingError;
	 
	 @JsonProperty("totalRecordsWithErrorCount")
	 private Integer totalRecordsWithErrorCount;
	 
	 @JsonProperty("totalRecordsSuccessfullyProcessedCount")
	 private Integer totalRecordsSuccessfullyProcessedCount;

	 @JsonProperty("errors")
     private Errors errors;

	@JsonProperty("data")
    private List<Datum> data = null;
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
    
    @JsonProperty("totalRecordsCount")
    public Integer getTotalRecordsCount() {
		return totalRecordsCount;
	}

    @JsonProperty("totalRecordsCount")
	public void setTotalRecordsCount(Integer totalRecordsCount) {
		this.totalRecordsCount = totalRecordsCount;
	}

    @JsonProperty("totalRecordsWithWarningCount")
	public Integer getTotalRecordsWithWarningCount() {
		return totalRecordsWithWarningCount;
	}

    @JsonProperty("totalRecordsWithWarningCount")
	public void setTotalRecordsWithWarningCount(Integer totalRecordsWithWarningCount) {
		this.totalRecordsWithWarningCount = totalRecordsWithWarningCount;
	}

    @JsonProperty("totalRecordsWithFormattingError")
	public Integer getTotalRecordsWithFormattingError() {
		return totalRecordsWithFormattingError;
	}

    @JsonProperty("totalRecordsWithFormattingError")
	public void setTotalRecordsWithFormattingError(Integer totalRecordsWithFormattingError) {
		this.totalRecordsWithFormattingError = totalRecordsWithFormattingError;
	}

    @JsonProperty("totalRecordsWithoutFormattingError")
	public Integer getTotalRecordsWithoutFormattingError() {
		return totalRecordsWithoutFormattingError;
	}

    @JsonProperty("totalRecordsWithoutFormattingError")
	public void setTotalRecordsWithoutFormattingError(Integer totalRecordsWithoutFormattingError) {
		this.totalRecordsWithoutFormattingError = totalRecordsWithoutFormattingError;
	}

    @JsonProperty("totalRecordsWithErrorCount")
	public Integer getTotalRecordsWithErrorCount() {
		return totalRecordsWithErrorCount;
	}

    @JsonProperty("totalRecordsWithErrorCount")
	public void setTotalRecordsWithErrorCount(Integer totalRecordsWithErrorCount) {
		this.totalRecordsWithErrorCount = totalRecordsWithErrorCount;
	}

    @JsonProperty("totalRecordsSuccessfullyProcessedCount")
	public Integer getTotalRecordsSuccessfullyProcessedCount() {
		return totalRecordsSuccessfullyProcessedCount;
	}

    @JsonProperty("totalRecordsSuccessfullyProcessedCount")
	public void setTotalRecordsSuccessfullyProcessedCount(Integer totalRecordsSuccessfullyProcessedCount) {
		this.totalRecordsSuccessfullyProcessedCount = totalRecordsSuccessfullyProcessedCount;
	}

}
