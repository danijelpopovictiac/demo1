package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class Demo1Application {

	public static int id = 0;

	public static void main(String[] args) {
		Random rnd = new Random();

		SpringApplication.run(Demo1Application.class, args);
		id = rnd.nextInt(10);
	}

	@RequestMapping("/")
	public String app(){
		return "Demo test: " + id + "\n";
	}
}
