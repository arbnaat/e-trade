package com.techprimers.springboot.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Errors {
	
	@JsonProperty("code")
	Integer code;
	
	@JsonProperty("reason")
	String reason;
	
}
