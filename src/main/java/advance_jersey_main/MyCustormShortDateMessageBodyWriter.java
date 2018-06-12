package advance_jersey_main;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

@Provider
@Produces("text/shortdate")
public class MyCustormShortDateMessageBodyWriter implements MessageBodyWriter<Date> {


    public boolean isWriteable(Class aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return Date.class.isAssignableFrom(aClass);
    }

    public void writeTo(Date date, Class aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap multivaluedMap, OutputStream outputStream) throws IOException, WebApplicationException {


        String shortDate = date.getDate() + " - " +date.getMonth()+" - " + date.getYear();

        outputStream.write(shortDate.getBytes());
    }

    public long getSize(Date date, Class type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }


}

