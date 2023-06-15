package com.example.Ejercicio3SpringDatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3SpringDatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(Ejercicio3SpringDatajpaApplication.class, args);

		CocheReppository repository=context.getBean(CocheReppository.class);

		System.out.println(repository.count());


	}

}
