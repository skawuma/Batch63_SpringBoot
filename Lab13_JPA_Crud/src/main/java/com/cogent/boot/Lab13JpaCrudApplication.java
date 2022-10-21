  package com.cogent.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.boot.controller.BookController;

@SpringBootApplication
public class Lab13JpaCrudApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Lab13JpaCrudApplication.class, args);
		BookController bookController= ctx.getBean(BookController.class);
		bookController.manageBook();
	}

}

