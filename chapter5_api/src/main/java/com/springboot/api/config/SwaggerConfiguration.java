package com.springboot.api.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 예제 5.22
@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().components(new Components()).info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("Spring Boot Open API Test with Swagger")
                .description("설명 부분")
                .version("1.0.0");
    }
}
