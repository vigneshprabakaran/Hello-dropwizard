/**
 * 
 */
package com.vignesh.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.vignesh.dropwizard.health.TemplateHealthCheck;
import com.vignesh.dropwizard.resources.ExampleServiceResource;
import com.vignesh.dropwizard.trial.config.ExampleServiceConfiguration;

/**
 * @author vicky
 *
 */
public class ExampleService extends Application<ExampleServiceConfiguration> {

	public static void main(String[] args) {
		try {
			new ExampleService().run(args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void initialize(Bootstrap<ExampleServiceConfiguration> bootstrap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(ExampleServiceConfiguration arg0, Environment arg1)
			throws Exception {
		// TODO Auto-generated method stub

		final ExampleServiceResource resource = new ExampleServiceResource(arg0
				.getMessages().getDefaultName(), arg0.getMessages().getHello());
		final TemplateHealthCheck healthCheck = new TemplateHealthCheck(
				arg0.getMessages().getHello());
		arg1.healthChecks().register("template", healthCheck);
		arg1.jersey().register(resource);

	}

}
