package br.things.academy.services;

import org.springframework.beans.factory.annotation.Autowired;

import br.things.academy.entities.Product;
import br.things.academy.repositories.ProductRepository;

public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	Product product;
	
	public void save(String name, String description) {
		this.productRepository.save(product);
	}
}
