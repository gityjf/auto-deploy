package com.git.jersey;


import com.git.entity.Person;

import javax.inject.Singleton;
import javax.print.attribute.standard.MediaSize;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api")
@Singleton
public class LoginService {


    @Path("/login")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String check(Person person){
        System.out.println(person.toString());
        return  "{\"check\":123}";
    }

    @Path("/login")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String login(@QueryParam("username") String username) throws Exception{
        return  "{\"test\":123}";
    }



}
