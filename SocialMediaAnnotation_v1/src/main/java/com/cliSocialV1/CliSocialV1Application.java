package com.cliSocialV1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class CliSocialV1Application {

    public static void main(String[] args) {
        SpringApplication.run(CliSocialV1Application.class, args);
        Scanner scanner = new Scanner(System.in);

        // Load the context from the package where your Spring components are located
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.cliSocialV1");
        
        // Get the bean from the context
        Content content = (Content) context.getBean("simpleContent");
        
        // User interaction
        System.out.println("Welcome to CliSocial!!!!");
		System.out.println("Write something!");
		String body = scanner.nextLine();
		content.setBody(body);
		System.out.println("[  You have posted this content  ]" + " \n   " + content.getBody());
		
		scanner.close();
		context.close();
    }
}
