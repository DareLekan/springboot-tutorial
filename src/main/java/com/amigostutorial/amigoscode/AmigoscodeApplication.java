package com.amigostutorial.amigoscode;

import com.amigostutorial.amigoscode.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping (path = "/")
public class AmigoscodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigoscodeApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Welcome to my student API \n dedicated to Felix";
	}

}