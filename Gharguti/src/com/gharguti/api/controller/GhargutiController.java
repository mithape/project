package com.gharguti.api.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.gharguti.api.model.LoginBean;
import com.gharguti.api.model.RegistrationBean;
import com.gharguti.api.services.GhargutiService;
import com.gharguti.api.services.GhargutiServiceImpl;

/**
 * 
 * @author Mayur
 * @version 1.0
 * @date 04/05/2019
 * @category Provide diffrent api.
 */

@Path("/rest")
public class GhargutiController {
	
	GhargutiService ghargutiService;
	
	@POST
	@Path("/login")
	@Produces("application/json")
	public Response getProductInJSON(LoginBean loginBean) {
		boolean flag = false;
		try {
			ghargutiService = new GhargutiServiceImpl();
			flag = ghargutiService.checkUserLogin(loginBean);
		}catch(Exception e) {
			return Response.status(201).entity("{\"ResponseCode\":99}").build();
		}finally {
			ghargutiService = null;
			loginBean = null;
		}
		if(flag)
			return Response.status(201).entity("{\"ResponseCode\":\"00\"}").build();
		else
			return Response.status(201).entity("{\"ResponseCode\":\"01\"}").build();

	}

	@POST
	@Path("/registration")
	@Consumes("application/json")
	public Response createProductInJSON(RegistrationBean registrationBean) {
		boolean flag = false;
		try {
			ghargutiService = new GhargutiServiceImpl();
			flag = ghargutiService.userRegistration(registrationBean);
		}catch(Exception e) {
			return Response.status(201).entity("{\"ResponseCode\":\"99\"}").build();
		}finally {
			ghargutiService = null;
			registrationBean = null;
		}
		
		if(flag)
			return Response.status(201).entity("{\"ResponseCode\":\"00\"}").build();
		else
			return Response.status(201).entity("{\"ResponseCode\":\"02\"}").build();
		
	}

}
