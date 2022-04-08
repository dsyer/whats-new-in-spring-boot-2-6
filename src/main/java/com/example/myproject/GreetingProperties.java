package com.example.myproject;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("greeting")
@ConstructorBinding
public class GreetingProperties {

    private String salutation;

    public  GreetingProperties(String salutation) {
        this.salutation = salutation;
    }

    public String salutation() {
        return salutation;
    }

}
