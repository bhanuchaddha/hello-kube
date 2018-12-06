package com.bhanuchaddha.kube.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloKubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloKubeApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello Kubernetes";
	}
}
