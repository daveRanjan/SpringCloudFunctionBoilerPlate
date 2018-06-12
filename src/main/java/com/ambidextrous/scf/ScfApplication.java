package com.ambidextrous.scf;

import com.ambidextrous.scf.model.FromModel;
import com.ambidextrous.scf.model.ToModel;
import com.ambidextrous.scf.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class ScfApplication {

    @Autowired
    CustomService customService;

    public static void main(String[] args) {
        SpringApplication.run(ScfApplication.class, args);
    }

    @Bean("componentFunction")
    public Function<FromModel, ToModel> handler(){
        return fromModel -> customService.convert(fromModel);
    }
}
