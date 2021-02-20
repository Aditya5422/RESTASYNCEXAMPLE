package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.ContentDisposition;

public class FileClient {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Client client=ClientBuilder.newClient(); WebTarget target =
		 * client.target("http://Localhost:8081/fileUpload.html"); Response response =
		 * target.request().get(); System.out.println(" Response is Saved");
		 */
		WebClient client=WebClient.create("http://localhost:8081/services/fileService/upload");
		client.type("multipart/form-data");
		ContentDisposition cd=new ContentDisposition("attachment;filename=002-1.jpg");
		Attachment attachment=new Attachment("root", new FileInputStream(new File("C:/Users/Aditya/Desktop/ADE/002-1.jpg")),cd );
		client.post(attachment);
	}

}
