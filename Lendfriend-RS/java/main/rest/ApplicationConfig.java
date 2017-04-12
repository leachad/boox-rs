package rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import rest.services.LookupService;
import rest.services.UserService;

@ApplicationPath("/rest/services")
public class ApplicationConfig extends Application {

	private Set<Class<?>> services = new HashSet<>();
	public ApplicationConfig() {
		services.add(UserService.class);
		services.add(LookupService.class);
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return this.services;
	}
}
