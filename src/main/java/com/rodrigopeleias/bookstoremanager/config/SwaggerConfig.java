package com.rodrigopeleias.bookstoremanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	private static final String API_TITLE = "Bookstore Manager Course";
	private static final String API_DESCRIPTION = "Bookstore Manager API Professional";
	private static final String API_VERSION = "1.0.0";
	private static final String CONTACT_NAME = "Leonardo Almeida - Github";
	private static final String CONTACT_GITHUB = "https://github.com/leonardo-teles";
	
	@Bean
	public OpenAPI api() {
		return new OpenAPI()
				.info(new Info()
						.title(API_TITLE)
						.description(API_DESCRIPTION)
						.version(API_VERSION))
				.externalDocs(new ExternalDocumentation()
						.description(CONTACT_NAME)
						.url(CONTACT_GITHUB));
	}
	
}
