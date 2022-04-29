package com.example.demo.io.github.bhil82;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nataribu on 29/04/2022.
 */

@SpringBootApplication
@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("ApplicationNmae")
    private String ApplicationNmae;

    @GetMapping("/HeloWolrd")
    public String HelloWorld(){
        return ApplicationNmae;
    }
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);

    }
}
