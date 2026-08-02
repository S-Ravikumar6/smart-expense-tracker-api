package com.ravikumar.smartexpensetrackerapi.config;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Smart Expense Tracker API",
                version = "1.0",
                description = "REST API for managing personal expenses using Spring Boot.",
                contact = @Contact(
                        name = "S Ravikumar",
                        email = "s.ravikumar1706@gmail.com",
                        url = "https://github.com/S-Ravikumar6"
                ),
                license = @License(
                        name = "MIT License"
                )
        )
)
public class OpenApiConfig
{

}