package com.cocky.init.config;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * JsonMapper
 */
@Configuration
public class JsonMapperConfig {
    
    // @Bean
    // public Jackson2ObjectMapperBuilder messMapper() {
    //     ObjectMapper objectMapper = new ObjectMapper();
    //     objectMapper.setDateFormat(new SimpleDateFormat("YYYY-MM-DD"));
    //     Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder = new Jackson2ObjectMapperBuilder();
    //     jackson2ObjectMapperBuilder.configure(objectMapper);
    //     return jackson2ObjectMapperBuilder;
    // }
    
}