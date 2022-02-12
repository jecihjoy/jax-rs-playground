package com.github.jaxrsplayground.resources;

import com.github.jaxrsplayground.model.Message;
import com.github.jaxrsplayground.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

    private MessageService service = new MessageService();

    @GET
    public List<Message> getMessages() {
        return service.getMessages();
    }

    @GET
    @Path("/{messageId}")
    public Message getMessage(@PathParam("messageId") Long id) {
        return service.getMessage(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Message postMessage(Message message) {
        return service.addMessage(message);
    }
}
