package com.jarvis.service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	/*A Service Registry is a core component in a microservices architecture. Its main role is to keep track of
	all the available microservices and their instances so that they can find and communicate with each other
	dynamically.*/
	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
