package Elgameya_static_api.Elgameya;

import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import Requests.PaymentRequest;
import Responses.InquiryResponse;
import Responses.PaymentResponse;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GameyaService {
	@GET
	public Response inquire(@QueryParam("mobile_number") String mobile_number) {
		if (mobile_number.equals("01065832836")) {
			HashMap<String, String> data = new HashMap<String, String>();
			data.put("total_overdue", "8000");
			data.put("month", "9");
			return Response.ok().entity(new InquiryResponse(200, true, data)).build();
		} else
			return Response.status(Status.BAD_REQUEST).build();
	}

	@POST
	public Response payGameya(PaymentRequest p) {
		if (p.getMobileNumber().equals("01065832836")) {
			PaymentResponse pr = new PaymentResponse(200, 2600L, "Successful Payment", "01065832836");
			return Response.ok().entity(pr).build();
		} else
			return Response.status(Status.BAD_REQUEST).build();
	}
}
