package com.example.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println("new line");
        System.out.println("");
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        SpringApplication.run(GitTestApplication.class, args);
    }

}
