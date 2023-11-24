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
	@GetMapping
	public List<Product> findAll() {
		List<Product> result = repo.findAll();
		return result;
		
	}
	
	@GetMapping("/{id}")
	public Product findById(@PathVariable String id) {
		Product result = repo.findById(id).get();
		return result;
	}
	
	
	@PostMapping
	public Product insert(@RequestBody Product product) {
		Product result = repo.save(product);
		return result;
	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		Product result = repo.save(product);
		return result;
	}
	
	@SuppressWarnings("finally")
	@DeleteMapping
	public Product remove(@RequestBody Product product){
		Product haveProduct = findById(product.getId());
		
		try {
			repo.delete(haveProduct);
		} catch (Exception e) {
			System.err.println("Erro!" + e.getMessage());
		}finally{
			return haveProduct;
		}
	}
}
