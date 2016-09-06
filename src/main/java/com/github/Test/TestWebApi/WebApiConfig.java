package com.github.Test.TestWebApi;


import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("webapi")
public class WebApiConfig extends ResourceConfig {
    public WebApiConfig() {
        packages(this.getClass().getPackage().getName());
//      packages("com.github.kamegu.first");
    }
}
