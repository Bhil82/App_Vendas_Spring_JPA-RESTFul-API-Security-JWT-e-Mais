package com.example.demo.io.github.bhil82;

import com.example.demo.io.github.bhil82.repository.service.Development;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;



/**
 * Created by nataribu on 29/04/2022.
 */

//@ComponentScan(basePackages = {"io.github.bhil82.repository", "io.github.bhil82.service"})
//@Configuration
//@Profile("development")//deixa disponivel apenas para ambiente de desenvolvimento

public class MyConfigruration {

    @Bean
    public CommandLineRunner Executar(){
        return args -> {
            System.out.println("rodando em ambiente de produção");
        };
    }


}
