/**
 * 
 */
package com.vignesh.dropwizard.trial.config;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

/**
 * @author vicky
 *
 */
public class ExampleServiceConfiguration extends Configuration{
	
	@Valid
	private MessageConfiguration messages;

	/**
	 * @return the messages
	 */
	@JsonProperty
	public MessageConfiguration getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	@JsonProperty
	public void setMessages(MessageConfiguration messages) {
		this.messages = messages;
	}
	
	
	
	

}
