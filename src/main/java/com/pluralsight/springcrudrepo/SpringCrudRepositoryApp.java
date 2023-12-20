package com.pluralsight.springcrudrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class SpringCrudRepositoryApp implements CommandLineRunner {

	@Autowired
	ProductRepository productDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudRepositoryApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product newProduct = productDao.save(new Product(82, "Peter Piper's peppers", 59.00));
		for (Product p: productDao.findAll()){
			System.out.println(p.name + " costs " + p.unitPrice);
		}

	}
}
