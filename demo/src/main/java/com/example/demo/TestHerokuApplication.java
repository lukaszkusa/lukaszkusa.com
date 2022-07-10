package com.example.demo;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class TestHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestHerokuApplication.class, args);
	}

}
