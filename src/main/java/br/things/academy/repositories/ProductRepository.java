package br.things.academy.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.things.academy.entities.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
