package com.example.demo.io.github.bhil82;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nataribu on 29/04/2022.
 */
@Configuration
@ComponentScan(basePackages = {"io.github.bhil82.repository", "io.github.bhil82.service"})
public class MyConfigruration {

    @Bean(name = "ApplicationNmae")
    public String ApplicationNmae(){
        return "sistema de vendas";
    }
}
