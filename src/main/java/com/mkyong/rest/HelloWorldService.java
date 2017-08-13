package com.mkyong.rest;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloWorldService {

	@GET
	@Path("ping")
	public Response getMsg(@Context HttpServletRequest requestContext) {

		String output = "Jersey Says : Ping Works Buddy";
		System.out.println("<!-- Reuest --" + requestContext.getRemoteAddr());
		return Response.status(200).entity(output).build();

	}

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Jersey say : " + msg;

		return Response.status(200).entity(output).build();

	}

}