package com.github.jaxrsplayground.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/** I debugged this for two consecutive days!!! I had missed the @Component annotation, that means
 * the resources were not being registered hence the 404 error*/
@ApplicationPath("api")
@Component
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        packages("com.github.jaxrsplayground.resources");
        property(ServletProperties.FILTER_FORWARD_ON_404, true); //#spring.jersey.type=servlet
        /*this configures jersey to forward requests it can't handle. Hence the requests reach
        spring MVC DispatcherServlet and other controllers, CHECK config properties file*/
    }
}

// There are three main ways (in a servlet container) to configure Jersey (JAX-RS):
/** With only web.xml
 * With both web.xml and an Application/ResourceConfig class
 * With only an Application/ResourceConfig class annotated with @ApplicationPath*/
