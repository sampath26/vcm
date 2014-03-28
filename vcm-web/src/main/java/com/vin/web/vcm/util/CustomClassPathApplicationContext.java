package com.vin.web.vcm.util;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractXmlApplicationContext;

public class CustomClassPathApplicationContext extends AbstractXmlApplicationContext{

	public CustomClassPathApplicationContext()
	{
		super();
		refresh(); //This is very important. Only after calling refresh(), the beanDefinitions are loaded from the overridden method loadBeanDefinitions
	}
	
	@Override
	protected void loadBeanDefinitions(XmlBeanDefinitionReader reader)
			throws BeansException, IOException {
	
		System.out.println("****************Loadinggggggggggggg************");
		reader.loadBeanDefinitions("Spring.beans.xml");
	}
	
	

}
