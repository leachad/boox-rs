package rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import api.UserInfoHelper;
import rest.info.UserInfo;

@Path("/user/v1")
public class UserService {

	@GET
	@Path("/{requestedUser}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findUser(@PathParam("requestedUser") String requestedUser) {
		UserInfo userInfo = UserInfoHelper.getFriendlyUserInfo(requestedUser);
		if (userInfo == null) {
			return Response.status(Response.Status.NOT_FOUND).entity("Entity not found for requested userName: " + requestedUser).build();	
		} 
		return Response.ok(userInfo, MediaType.APPLICATION_JSON).build();
	 	
	}
	
}
