package com.example.obSpringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringDataApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringDataApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("probando desde spring");

		System.out.println(repository.count());

		Coche coche = new Coche(null,"seat","model",2000);

		repository.save(coche);

		System.out.println("Numero de coches de la bdd: " +repository.count());

		System.out.println(repository.findAll());


	}

}
