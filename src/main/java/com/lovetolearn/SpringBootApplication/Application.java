package com.lovetolearn.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	public static final Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		logger.info("its a continous interation job");
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("its my third logger");
	}
}
