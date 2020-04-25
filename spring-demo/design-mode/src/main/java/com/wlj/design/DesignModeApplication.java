package com.wlj.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.wlj.design"})
public class DesignModeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignModeApplication.class, args);
	}

}
