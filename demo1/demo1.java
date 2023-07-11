package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class demo1 {
    public static void main(String[] args) {

        SpringApplication.run(demo1.class, args);

        if(args.length>0){
            System.out.println(args);
        }else{
            System.out.println("Hello World?");
        }

    }
}
