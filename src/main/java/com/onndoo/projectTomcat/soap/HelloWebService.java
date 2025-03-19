package com.onndoo.projectTomcat.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface HelloWebService {

	@WebMethod
	public void sayHello();
}
