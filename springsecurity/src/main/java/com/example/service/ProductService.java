package com.example.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.example.model.Product;

@Path("/productService")
public interface ProductService {
	@GET
	@Path("/products")
	List<Product> products();

	@POST
	@Path("/products")
	Product addProduct(Product product);

}
