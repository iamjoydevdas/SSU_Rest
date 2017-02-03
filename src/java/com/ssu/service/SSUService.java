/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ssu.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author int
 */
@Path("/ssu")
public class SSUService {
    @GET
    @Path("/ping")
     public Response ping(){
        return Response.status(200).entity("SSU is getting started").build();
    }
}
