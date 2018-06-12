package advance_jersey_main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("{path}/test")
public class TestClass {

    @PathParam("path") private String name;
    @QueryParam("quary") private String quaryParam;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testMethod(){
        return " This is the test \n Path param display - "+name+"\n Quary param display -  "+quaryParam;
    }

}
