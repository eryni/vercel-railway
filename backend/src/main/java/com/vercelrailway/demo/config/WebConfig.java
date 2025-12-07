package com.vercelrailway.demo.config; // Adjust package name

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow all endpoints (/**) to accept requests from your Vercel URL
        registry.addMapping("/**") 
            .allowedOrigins("https://nrcpExpenseTrack.vercel.app") // <-- IMPORTANT: REPLACE THIS
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Common HTTP methods
            .allowedHeaders("*") // Allow all headers
            .allowCredentials(true) // Allow cookies, auth headers, etc.
            .maxAge(3600); // Cache pre-flight request for 1 hour
    }
}