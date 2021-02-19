package com.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class CheckProessingClient {
	public static void main(String[] args)
	{
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:8091/restsync/services/checkProcess/checks");
		AsyncInvoker async=target.request().async();
		Future<Boolean> response=async.post(Entity.entity(new CheckList(), MediaType.APPLICATION_XML),Boolean.class);
		try {
			System.out.println(response.get());
		} catch (InterruptedException | ExecutionException e) {
			if(e.getCause() instanceof BadRequestException) {
				BadRequestException bre=(BadRequestException)e.getCause();
				System.out.println("plz send a vaild list of check");
			}
		}
	}

}
