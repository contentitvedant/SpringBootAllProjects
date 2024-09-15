package com.cliSocialV2;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CliSocialV2Application {

    public static void main(String[] args) {
        SpringApplication.run(CliSocialV2Application.class, args);

        Scanner scanner = new Scanner(System.in);

        // Use AnnotationConfigApplicationContext for annotation-based configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.cliSocialV2");

        UserProfile user = context.getBean(BasicUser.class);
        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();
        user.setUsername(userName);

        while (true) { 	
            ContentCollection contentCollection = context.getBean(ContentList.class);

            System.out.println("1) Make new post \n2) Show all posts \n3) Exit");
            int menuItem = scanner.nextInt();
            switch (menuItem) {
                case 1: {
                    Content content = context.getBean(SimpleContent.class);
                    System.out.println("Please enter a post:");
                    scanner.nextLine(); // clear the buffer
                    String message = scanner.nextLine();
                    content.setMessage(message);
                    contentCollection.setContent(content);
                    break;
                }
                case 2: {
                    System.out.println("All the posts:");
                    for (int i = 0; i < contentCollection.size(); i++) {
                        System.out.println(i + ") " + user.getUsername() + ": "+ user.getContent()+" ");
                    }
                    break;
                }
                case 3: {
                    // Exit
                    context.close();
                    scanner.close();
                    return;
                }
                default:
                    System.out.println("Unexpected value: " + menuItem);
            }
        }
    }
}
