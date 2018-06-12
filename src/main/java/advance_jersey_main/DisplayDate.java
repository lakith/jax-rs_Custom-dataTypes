package advance_jersey_main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Calendar;
import java.util.Date;

@Path("dislayDate")
public class DisplayDate {


    @GET
    @Produces(value = {MediaType.TEXT_PLAIN, "text/shortdate"})
    public Date dateDisplay(){

        return Calendar.getInstance().getTime();

    }


}
