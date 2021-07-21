package com.example.carSale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.carSale")
public class SpringConfig {

    @Bean
    public SportConfiguration sportConfiguration() {
        return new SportConfiguration();
    }

    @Bean
    public SedanConfiguration sedanConfiguration() {
        return new SedanConfiguration();
    }


    @Bean
    public HatchbackConfiguration hatchbackConfiguration() {
        return new HatchbackConfiguration();
    }

    @Bean
    public JeepConfiguration jeepConfiguration() {
        return new JeepConfiguration();
    }

    @Bean
    public Car sportCar() {
        return new Car(sportConfiguration());
    }


    @Bean
    public Car sedanCar() {
        return new Car(sedanConfiguration());
    }

    @Bean
    public Car hatchbackCar() {
        return new Car(hatchbackConfiguration());
    }


    @Bean
    public Car jeepCar() {
        return new Car(jeepConfiguration());
    }
}
