package com.kgisl.sb10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Sb10Application {

	public static void main(String[] args) {
		SpringApplication.run(Sb10Application.class, args);
	}

}
