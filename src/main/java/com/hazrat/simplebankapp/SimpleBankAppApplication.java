package com.hazrat.simplebankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SimpleBankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleBankAppApplication.class, args);
	}

}
