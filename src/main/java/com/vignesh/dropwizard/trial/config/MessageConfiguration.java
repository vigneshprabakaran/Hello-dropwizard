/**
 * 
 */
package com.vignesh.dropwizard.trial.config;

import javax.validation.constraints.NotNull;

/**
 * @author vicky
 *
 */
public class MessageConfiguration {
	
	@NotNull
	private String hello;
	
	private String defaultName;
	
	public String getHello() {
		return hello;
	}
	
	public void setHello(String hello) {
		this.hello = hello;
	}

	public String getDefaultName() {
		return defaultName;
	}

	public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}
	
	

}
