package com.udacity.ak.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.ak.jokedata.JokeProvider;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.ak.udacity.com",
                ownerName = "backend.builditbigger.ak.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }

    @ApiMethod(name = "tellJoke")
    public MyBean tellJoke(){
        MyBean response = new MyBean();
        JokeProvider jokeProvider = new JokeProvider();
        response.setData(jokeProvider.getJoke());
        return response;
    }

}
