package com.vin.web.vcm.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.vin.web.vcm.api.RegisterService;
import com.vin.web.vcm.beans.User;
import com.vin.web.vcm.impl.RegisterServiceImpl;

@Path("/users")
public class RegisterResource {
	
	private static Logger logger = Logger.getLogger("RegisterResource");
	
	private RegisterService registerService;
	
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<User> getUsers() throws Exception{
		logger.info(registerService.toString());
		System.out.println("RegisterServiceImpl:::::::::   " + registerService.toString());
		return registerService.getUsers();
	}
	
	

}
