package com.example;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import com.example.model.CheckList;
@Path("/checkProcess")
public interface CheckProcess {

	@POST
	@Path("/checks")
	public void check(@Suspended AsyncResponse resp, CheckList checkList);
	
	
	
}
