package com.onndoo.projectTomcat.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class HelloWebServiceImpl implements HelloWebService{

	@WebMethod
	public void sayHello() {
		System.out.println("HOLA");
		
	}

}
