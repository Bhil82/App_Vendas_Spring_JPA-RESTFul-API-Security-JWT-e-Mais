package com.example.demo.io.github.bhil82;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nataribu on 30/04/2022.
 */
@Configuration
public class AnimalConfiguration {

    @Bean(name = "Cachorro")
    public Animal Cachorro() {
        return new Animal() {
            @Override
            public void FazerBarulho() {
                System.out.print("Au au au!");

            }

        };
    }

    @Bean(name="gato")
    public Animal Gato () {
        return new Animal() {
            @Override
            public void FazerBarulho() {
                System.out.print("mi Au miau miau!");

            }

        };
    }
}
