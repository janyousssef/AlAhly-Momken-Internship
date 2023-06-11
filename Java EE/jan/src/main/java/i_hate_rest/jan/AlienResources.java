package i_hate_rest.jan;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("getAlien")
public class AlienResources {
	AlienRepo repo = new AlienRepo();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens() {
		System.out.println("getting alien");

		List<Alien> aliens = repo.getAliens();
		return aliens;
	}

	@GET
	@Path("Alien/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Alien getAlien(@PathParam("id")int  id) {
		return repo.getAlien(id);
	}

	@POST
	@Path("create")
	public void createAlien(Alien a) {
		System.out.println("test");
		repo.createAlien(a);
	}
}
