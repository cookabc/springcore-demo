package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * MainApp
 *
 * @author: Xugang Song
 * @create: 1/3/21
 */
public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        MessageService service = context.getBean(MessageService.class);
        String message = "Hello World";
        service.sendMessage(message);
        System.out.println(service.getMessage());

        context.close();
    }

}
