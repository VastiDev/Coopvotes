package com.vastidev.coopvotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/")
public class CoopvotesApplication {

    @GetMapping
    public String teteHome(){
        return "teste home Coopvotes";
    }

    public static void main(String[] args) {
        SpringApplication.run(CoopvotesApplication.class, args);
    }


}
