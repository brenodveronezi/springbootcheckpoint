package com.brenodveronezi.desafiospringboot.swagger;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.*;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

public class SwaggerConfig {
    @Bean
    public Docket apiAdmin(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.brenodveronezi.backend"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(apiInfo())
                .globalRequestParameters(
                        Collections.singletonList(
                                new RequestParameterBuilder()
                                        .name("Authorization")
                                        .description("Header para token JWT")
                                        .in("header")
                                        .required(false)
                                        .build()));


    }

    @Bean
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("API-REST")
                .description("Api para gerenciamento de ponto e acesso")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org.licenses/LICENSE-2.0")
                .contact(new Contact("BRENO", "brenodveronezi@gmail.com", "brenodveronezi@gmail.com"))
                .build();
    }

}
