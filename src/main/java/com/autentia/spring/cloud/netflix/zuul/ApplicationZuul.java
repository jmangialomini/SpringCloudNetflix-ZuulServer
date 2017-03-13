package com.autentia.spring.cloud.netflix.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableZuulProxy
public class ApplicationZuul {
	
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationZuul.class).web(true).run(args);
    }
}
