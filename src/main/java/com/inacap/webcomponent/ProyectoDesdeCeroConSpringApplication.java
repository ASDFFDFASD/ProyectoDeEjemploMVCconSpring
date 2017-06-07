package com.inacap.webcomponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.inacap.webcomponent","com.inacap.webcomponent.controller"} )
public class ProyectoDesdeCeroConSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoDesdeCeroConSpringApplication.class, args);
	}
}
