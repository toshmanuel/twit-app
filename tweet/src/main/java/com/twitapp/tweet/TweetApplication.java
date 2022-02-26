package com.twitapp.tweet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.twitapp.clients")
public class TweetApplication {
    public static void main(String[] args) {
        SpringApplication.run(TweetApplication.class, args);
    }
}
