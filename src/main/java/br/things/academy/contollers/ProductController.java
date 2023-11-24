package br.things.academy.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.things.academy.entities.Product;
import br.things.academy.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired 
	ProductRepository repo;
	Product product;
	@GetMapping // its ok
	public List<Product> findAll() {
		List<Product> result = repo.findAll();
		return result;
		
	}
	
	@GetMapping("/{id}") // its ok
	public Product findById(@PathVariable String id) {
		Product result = repo.findById(id).get();
		return result;
	}
	
	
	@PostMapping // its ok
	public Product insert(@RequestBody Product product) {
		Product result = repo.save(product);
		return result;
	}
	
	@PutMapping // its ok
	public Product update(@RequestBody Product product) {
		Product result = repo.save(product);
		return result;
	}
	
	@DeleteMapping
	public Product remove(@RequestBody Product product) {
		try {
			repo.delete(product);
		} catch (Exception e) {
			System.err.println("Exception:");
			System.err.println(e.getMessage() + " : \n" + e.getClass());
		}
		return product;
	}
}
