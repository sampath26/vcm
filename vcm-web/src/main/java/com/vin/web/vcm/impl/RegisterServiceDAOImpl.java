package com.vin.web.vcm.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class RegisterServiceDAOImpl implements RegisterServiceDAO{

	@Override
	public List<UserEntity> getUsers() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from UserEntity");
		List<UserEntity> entities = query.list();
		return entities;
	}

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void createUser(UserEntity entity) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		sessionFactory.close();
		
		
		
	}
	
	

}
