package com.example.demo;

import com.example.demo.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository) {
		return args -> {
			Student student = new Student(
					"iqbal",
					"fakhriza",
					"iqbal@gmail.com",
					"laki-laki",
					"jl. mas no. 3",
					List.of("Computer Science", "Information Technology"),
					BigDecimal.TEN,
					LocalDateTime.now()
			);

			repository.insert(student);
		};
	}
}
