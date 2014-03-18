package com.vin.web.vcm.api;

import java.util.List;

import com.vin.web.vcm.beans.User;

public interface RegisterService extends Service{
	
	public void createUser(User user);
	
	public List<User> getUsers() throws Exception;

}
