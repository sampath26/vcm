package com.vin.web.vcm.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="DummyServiceWS", serviceName="DummyService", portName="DummyServicePort", targetNamespace="http://vin.vcm.com/ws")
public class DummyServiceWS {
	
	@WebMethod
	public String sayHello() {
		return "Hello Users!!!";
	}

}
