package com.vin.web.vcm.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.vin.web.vcm.api.RegisterService;
import com.vin.web.vcm.beans.User;


public class RegisterServiceImpl implements RegisterService {

	private RegisterServiceDAO registerServiceDAO;
	
	public void setRegisterServiceDAO(RegisterServiceDAO registerServiceDAO) {
		this.registerServiceDAO = registerServiceDAO;
	}

	@Override
	public void createUser(User user) {
		
		UserEntity entity = new UserEntity();
		entity.setFirstName(user.getFirstName());
		entity.setLastName(user.getLastName());
	
		System.out.println(" ******************************************************** ");
		
		registerServiceDAO.createUser(entity);
		
		System.out.println("FirstName: " + user.getFirstName() + " LastName: " + user.getLastName());
		
	}

	@Override
	public List<User> getUsers() throws Exception{
		List<User> users = null;
		System.out.println("RegisterServiceDAOImpl:::::::::   " + registerServiceDAO.toString());
		List<UserEntity> entities = registerServiceDAO.getUsers();
		if(entities != null && entities.size() != 0)
		{
			users = new ArrayList<User>();
			for(UserEntity entity : entities)
			{
				User user = new User();
				BeanUtils.copyProperties(entity, user);
				users.add(user);
			}
			
		}
		
		return users;
	}
	
	
	
	
	

}
