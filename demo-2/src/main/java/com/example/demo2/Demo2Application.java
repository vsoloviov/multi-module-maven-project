package com.example.demo2;

import com.example.core.Core;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Demo2Application {

	@RequestMapping("/")
	String home() {
		// TODO this is a todo message for the Jenkins Task Scanner plugin
		return new Core().sayHello("World");
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
}
