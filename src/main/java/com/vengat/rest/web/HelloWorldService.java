package com.vengat.rest.web;

import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 6/20/13
 * Time: 9:49 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/hello")
public class HelloWorldService {

    @GET
    @Path("/{param}")
    public Response getMessage(@PathParam("param") String msg) {

        String msgOutput = "Jersey say : " + msg;

        return Response.status(200).entity(msgOutput).build();
    }


}
