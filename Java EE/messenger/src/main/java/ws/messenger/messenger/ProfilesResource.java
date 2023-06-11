package ws.messenger.messenger;

import java.net.URI;
import java.util.ArrayList;
import java.util.Map;

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
import javax.ws.rs.core.UriInfo;

import ws.messenger.database.DatabaseSim;
import ws.messenger.model.Profile;
import ws.messenger.services.ProfileService;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/profiles")
public class ProfilesResource {
	private Map<String, Profile> Profiles = DatabaseSim.getProfiles();
	ProfileService ps = new ProfileService();

	@GET
	public ArrayList<Profile> getAllProfiles() {
		return new ArrayList<Profile>(Profiles.values());
	}

	@GET
	@Path("/{name}")
	public Response getProfile(@PathParam("name") String name, @Context UriInfo uriInfo) {
		return Response.ok(Profiles.get(name)).build();
	}

	@DELETE
	@Path("/{name}")
	public Profile deleteProfile(@PathParam("name") String name) {
		return Profiles.remove(name);
	}

	@POST
	public Response addProfile(Profile p, @Context UriInfo uriInfo) {
		Profile newP = Profiles.put(p.getName(), p);
		URI uri = uriInfo.getAbsolutePathBuilder().path(newP.getName()).build();
		return Response.created(uri).entity(newP).build();
	}

	@PUT
	@Path("/{name}")
	public Response updateProfile(@PathParam("name") String name, Profile p, @Context UriInfo uriInfo) {
		Profile newP = Profiles.put(name, p);
		URI uri = uriInfo.getAbsolutePathBuilder().path(newP.getName()).build();
		return Response.created(uri).entity(newP).build();

	}

}
