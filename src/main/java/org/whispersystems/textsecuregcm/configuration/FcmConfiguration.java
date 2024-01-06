package org.whispersystems.textsecuregcm.configuration;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FcmConfiguration {
	
	  @NotNull
	  @JsonProperty
	  private long senderId;

	  @NotEmpty
	  @JsonProperty
	  private String apiKey;

	  public String getApiKey() {
	    return apiKey;
	  }

	  public long getSenderId() {
	    return senderId;
	  }

	}
