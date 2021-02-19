package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.example.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	private List<Product> products = new ArrayList<Product>();
	private long id = 123;

	
	public ProductServiceImpl() {
		Product prod = new Product();
		prod.setId(id);
		prod.setDescription("Hello");
		products.add(prod);
	}

	@Override
	public List<Product> products() {
		return products;
	}

	@Override
	public Product addProduct(Product product) {
		Product prod = new Product();
		prod.setId(++id); 
		prod.setDescription(product.getDescription());//product.setId(++id);
		products.add(prod);//products.add(product)
		return prod;   //product.getId();
	}

}
