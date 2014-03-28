package com.vin.web.vcm.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.vin.web.vcm.api.Service;

public class ServiceFactory implements ApplicationContextAware{

	private static final ServiceFactory srvcfactory = new ServiceFactory();
	
	private static ApplicationContext appContext;
	
	private ServiceFactory()
	{
		
	}

	public static ServiceFactory getInstance()
	{
		return srvcfactory;
	}
	
	public static Service getService(String serviceName)
	{
		return (Service) appContext.getBean(serviceName);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		
		this.appContext = context;
	}
	
	

}
