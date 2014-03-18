package com.vin.web.vcm.impl;

import java.util.List;

public interface RegisterServiceDAO {
	
	public void createUser(UserEntity entity);
	
	public List<UserEntity> getUsers();

}
