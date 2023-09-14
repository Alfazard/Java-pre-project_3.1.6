package com.alfazard.web;

import com.alfazard.web.config.Config;
import com.alfazard.web.controller.RestController;
import com.alfazard.web.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        RestController communication = context.getBean("restController", RestController.class);


        System.out.println(communication.save(new User(3L, "James", "Brown", (byte) 26)) +
                communication.update(new User(3L, "Thomas", "Shelby", (byte) 26))
                + communication.delete(3L));
    }
//    5ebfebe7cb975dfcf9
}
