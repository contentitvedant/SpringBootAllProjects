package com.cliSocialAnnotation_v3;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class CliSocialV3Application {

	public static void main(String[] args) {
		SpringApplication.run(CliSocialV3Application.class, args);
		Scanner scanner = new Scanner(System.in);

//		XmlConfiguration Way Of IOC 
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext("com.cliSocialAnnotation_v3");
		UserProfile user = (UserProfile) context.getBean(BasicUser.class);
		System.out.println("Please enter your name !");
		String userName = scanner.nextLine();
		user.setUsername(userName);

		while (true) {
			ContentCollection contenList = (ContentCollection) context.getBean(ContentList.class);

			System.out.println("1) make new post \n2)show all posts \n3)exit");
			int menuItem = scanner.nextInt();
			switch (menuItem) {
			case 1: {
				Content content = (Content) context.getBean(SimpleContent.class);
				System.out.println("please enter a post");
				scanner.nextLine(); // getting the \n and moving to the next input
				String message = scanner.nextLine();
				content.setBody(message);
				contenList.addContent(content);
				break;
			}
			case 2: {
				System.out.println("All the posts !");
				for (int i = 0; i < contenList.getContentCount(); i++) {
					System.out.println("the ref of post " + contenList.getContent(i).toString());
					System.out.println(i + ") " + " "+user.getUsername()+" :  " + contenList.getContent(i).getBody());
				}
				break;
			}
			case 3: {
				 context.close();
                 scanner.close();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + menuItem);
			}}
		 
	}

}
