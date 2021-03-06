package org.globant.topic6.controller;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class SwaggerSpringMvcConfig {
 
    private SpringSwaggerConfig springSwaggerConfig;
 
    @Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
        this.springSwaggerConfig = springSwaggerConfig;
    }
 
    @Bean
    public SwaggerSpringMvcPlugin customImplementation() {
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                .apiInfo(apiInfo())
                .includePatterns(".*/*.*");
    }
 
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Users API",
                "Your user database!",
                "http://userweb.userapi.com/Terms_of_service",
                "userapi.manager@gmail.com",
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0.html"
        );
    }
}