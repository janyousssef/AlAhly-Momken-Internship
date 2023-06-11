package ws.messenger.messenger;

import java.net.URI;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import ws.messenger.model.Message;
import ws.messenger.services.MessageService;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessagesResource {
	MessageService ms = new MessageService();

	@GET
	public ArrayList<Message> getMessages() {
		MessageService ms = new MessageService();
		return ms.getAllMessages();
	}

	@GET
	@Path("/{id}")
	public Response getMessage(@PathParam("id") int id) {
		return Response.ok(ms.getMessage(id)).build();      
				
	}

	@POST
	public Response addMessage(Message m,@Context UriInfo uriInfo) {
		Message msg= ms.addMessage(m);
		int id=msg.getId();
		String idStr=String.valueOf(id);
		URI uri=uriInfo.getAbsolutePathBuilder().path(idStr).build();
		return Response.created(uri).entity(msg).build();      
	}

	@DELETE
	@Path("/{id}")
	public Response removeMessage(@PathParam("id") int id) {
		return Response.ok(ms.removeMessage(ms.getMessage(id))).build();      
	}

	@PUT
	@Path("/{id}")
	public Response updateMessage(@PathParam("id") int id, Message m) {
		m.setId(id);
		return Response.status(Status.OK).entity(ms.updateMessage(m)).build();      
	}

}
