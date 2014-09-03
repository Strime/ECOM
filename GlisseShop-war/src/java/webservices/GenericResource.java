/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webservices;

import DAL.DALFamily;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Sancassani
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of webservices.GenericResource
     * @param id
     * @return an instance of java.lang.String
     */
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    @Path("getJson")
    public String getJSON(@QueryParam(value = "id") Integer id) {
        //TODO return proper representation object
        return (new DALFamily()).getFamily(id).toString();
    }
    
    @GET
    @Produces("application/json")
    @Path("getJson2")
    public String getJSON2() {
        //TODO return proper representation object
        return "plop2";
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJSON(String content) {
    }
}
