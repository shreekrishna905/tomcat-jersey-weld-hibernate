package com.causy.rest.resources;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/service/")
public class Application extends ResourceConfig {

    public Application() {

        register(PersonResource.class);
        register(EmployeeResource.class);
        register(MessageResource.class);
    }
}