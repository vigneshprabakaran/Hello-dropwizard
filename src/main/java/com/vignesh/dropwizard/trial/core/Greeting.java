/**
 * 
 */
package com.vignesh.dropwizard.trial.core;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vicky
 *
 */
public class Greeting {
	
	private long id;
	private String content;
	
	
	
	@JsonProperty
	public String getContent() {
		return content;
	}
	
	@JsonProperty
	public long getId() {
		return id;
	}
	
	
	
	public Greeting(){}
	
	public Greeting(long id,String content){
		
		this.id=id;
		this.content=content;
	}

}
