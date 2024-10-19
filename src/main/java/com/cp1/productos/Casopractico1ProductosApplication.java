package com.cp1.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)
public class Casopractico1ProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Casopractico1ProductosApplication.class, args);
	}

}
