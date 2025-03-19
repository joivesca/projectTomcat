package com.onndoo.projectTomcat.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(value = "/rest")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHtml() {
		return "<html><body>HOLA DESDE TOMCAT</body></html>";
	}
}
