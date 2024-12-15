package com.spring.week1.introduction.springIntroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIntroductionApplication implements CommandLineRunner{
//	@Autowired
//	Apple ap;
//
//	@Autowired
//	Apple ap2;
	@Autowired
	DBService dbservice;

	public static void main(String[] args) {

		SpringApplication.run(SpringIntroductionApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		ap.eatApple();
//		ap2.eatApple();
//
//		System.out.println(ap.hashCode());
		System.out.println(dbservice.getData());


	}
}
