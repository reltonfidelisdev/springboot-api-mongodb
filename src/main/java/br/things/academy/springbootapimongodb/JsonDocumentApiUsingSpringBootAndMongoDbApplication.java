package br.things.academy.springbootapimongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JsonDocumentApiUsingSpringBootAndMongoDbApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JsonDocumentApiUsingSpringBootAndMongoDbApplication.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception {
		

	}

}
