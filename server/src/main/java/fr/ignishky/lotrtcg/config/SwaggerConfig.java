package fr.ignishky.lotrtcg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Set;

import static java.util.Collections.emptyList;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static springfox.documentation.builders.PathSelectors.any;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

@Configuration
public class SwaggerConfig {

    private static final Contact CONTACT = new Contact("Ignishky", "https://github.com/Ignishky", "thierry.ducloyer@gmail.com");

    @Bean
    public Docket api() {
        return new Docket(SWAGGER_2)
                .apiInfo(new ApiInfo("name", "description", "version", null, CONTACT, null, null, emptyList()))
                .tags(new Tag("Card", "All the cards endpoints."))
                .produces(Set.of(APPLICATION_JSON_VALUE))
                .useDefaultResponseMessages(false)
                .select()
                .apis(basePackage("fr.ignishky.lotrtcg.controller"))
                .paths(any())
                .build();
    }
}
