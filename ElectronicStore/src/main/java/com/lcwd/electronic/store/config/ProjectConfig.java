package com.lcwd.electronic.store.config;

import com.lcwd.electronic.store.dtos.Car;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }

    @Bean(name="car1")
    public Car car(){
        return new Car("Tesla Model s");
    }

}
