package com.intellij.project.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@ServletComponentScan
@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(FirstprojectApplication.class, args);
          Avatar a1=context.getBean(Avatar.class);
		  a1.fly();
		  Avatar a2=context.getBean(Avatar.class);
		  a2.fly();



	}

}
