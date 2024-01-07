package com.Website.LaptopStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//	TODO:
//	rename models name to english proper
//	change field injections to constructor injections
//	migrate away from jquery, replace responsive slide
//	manage images through database instead of hard coding
//	remove static resource binding in WebConfig.java
@SpringBootApplication
public class LaptopStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopStoreApplication.class, args);
	}

}
