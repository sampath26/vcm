package com.vin.web.vcm.util;

import com.vin.web.vcm.api.Service;

public class Invoker {

	private Invoker()
	{
		
	}
	
	public static void startup()
	{
		ServiceFactory.getInstance().setApplicationContext(new CustomClassPathApplicationContext());
	}
	
	public static Service getService(String serviceName)
	{
		return (Service) ServiceFactory.getInstance().getService(serviceName);
	}
	
}
