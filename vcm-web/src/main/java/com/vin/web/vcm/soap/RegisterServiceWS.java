package com.vin.web.vcm.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.vin.web.vcm.api.RegisterService;
import com.vin.web.vcm.beans.User;

//@WebService(name="RegisterServiceWS", serviceName="RegisterService", portName="RegisterServicePort", targetNamespace="http://vin.vcm.com/register")
public class RegisterServiceWS implements RegisterService{

	private RegisterService registerService;
	
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

	@Override
//	@WebMethod
	public void createUser(User user) {
		registerService.createUser(user);
	}

	@Override
//	@WebMethod
	public List<User> getUsers() throws Exception {
		return registerService.getUsers();
	}
	
}
