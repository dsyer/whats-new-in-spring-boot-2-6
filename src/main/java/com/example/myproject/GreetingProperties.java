package com.example.myproject;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("greeting")
public record GreetingProperties(String salutation) {

}
