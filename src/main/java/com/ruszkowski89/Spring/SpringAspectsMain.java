package com.ruszkowski89.Spring;

import com.ruszkowski89.Spring.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAspectsMain {
    public static void main (String args[]){


        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ShapeService service = context.getBean("shapeService", ShapeService.class);
        service.getCircle();

    }
}
