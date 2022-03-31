package com.thiagoti.alura.challenge.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

import com.thiagoti.alura.challenge.config.props.ApplicationProperties;

@Configuration
@ConfigurationPropertiesScan(basePackageClasses = ApplicationProperties.class)
public class ApplicationConfig {

}
