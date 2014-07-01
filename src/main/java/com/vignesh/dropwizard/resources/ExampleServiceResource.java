/**
 * 
 */
package com.vignesh.dropwizard.resources;

import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.vignesh.dropwizard.trial.core.Greeting;

/**
 * @author vicky
 *
 */
@Path("/helloworld")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleServiceResource {
	
	private final String defaultName;
	private final AtomicLong counter;
	private final String greetMessage;
	
	public ExampleServiceResource(String defaultName,String greeting) {
		// TODO Auto-generated constructor stub
		this.defaultName=defaultName;
		this.greetMessage=greeting;
		this.counter=new AtomicLong();
	}
	
	@GET
	@Timed
	public Greeting sayHello(@QueryParam("name") Optional<String> name){
		
		final String value = String.format(greetMessage,name.or(defaultName));
		return new Greeting(counter.incrementAndGet(),value);
		
		
		
	}
	
	
	

}
