package com.vin.web.vcm.actions;

import com.vin.web.vcm.api.RegisterService;
import com.vin.web.vcm.beans.User;


public class SampleAction {
	
	private String firstName;
	
	private String lastName;
	
	private RegisterService registerService;
	
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String execute() throws Exception
	{
		User user = new User();
		user.setFirstName(this.firstName);
		user.setLastName(this.lastName);
		
		System.out.println(registerService.toString());
		
		registerService.createUser(user);
		
		return "success";
		
	}

}
