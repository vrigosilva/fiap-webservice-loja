package com.github.dsaouda.fiap.webservice.loja.api.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionHandler implements ExceptionMapper<Throwable> {
	
	@Override 
	public Response toResponse(Throwable t) {		
		t.printStackTrace();
		
		return Response.status(Status.BAD_REQUEST)
			.entity(Status.BAD_REQUEST.getReasonPhrase()).build();
	}
	
}