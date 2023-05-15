package com.portfolio.portfolioBackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortfolioBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioBackEndApplication.class, args);
	}

        @Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://portfolio-danilo-bascourleguy.web.app").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
	
}
