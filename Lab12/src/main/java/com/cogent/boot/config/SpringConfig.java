package com.cogent.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.cogent.boot.controller", "com.cogent.boot.service"})
public class SpringConfig {

}
