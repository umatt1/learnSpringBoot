package com.mycompany.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication {

    int x = 0;

    @RequestMapping("/")
    String home() {
        x = x + 1;
        return "I have been called " + x + " times! \n";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}

