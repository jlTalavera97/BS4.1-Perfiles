package com.example.BS4.Perfiles;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Data
@Configuration
@PropertySource("classpath:miconfig.properties")
public class Configuracion {

    @Value("${VAR1}")
    private String var1;

    @Value("${VAR2}")
    private String var2;


    @PostConstruct
    public void printValues(){

        System.out.println(var1 +" "+ var2);
    }

}
