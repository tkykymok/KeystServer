package com.c4c.keystone.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)
public class ApplicationProperties {

    @Autowired
    private Environment env;

    public String get(String key) {
        return env.getProperty(key);
    }
}
