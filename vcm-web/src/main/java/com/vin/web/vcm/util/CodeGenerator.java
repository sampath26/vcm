package com.vin.web.vcm.util;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.bytecode.ClassFile;

public class CodeGenerator {

	

	public static void generateRemoteInterface(String className) throws Exception
	{
		ClassPool pool = ClassPool.getDefault();
		CtClass apiInterfaceClass = pool.get(className);
		String remoteInterfaceName = apiInterfaceClass.getPackageName().concat(".Webserv").concat(apiInterfaceClass.getSimpleName());
		CtClass remoteInterfaceClass = pool.makeInterface(remoteInterfaceName, apiInterfaceClass);
		System.out.println(remoteInterfaceClass);
		System.out.println(remoteInterfaceClass.getInterfaces()[0]);
	}
	
	public static void main(String[] args) throws Exception {
		
		generateRemoteInterface("com.vin.web.services.RegisterService");

	}

}
