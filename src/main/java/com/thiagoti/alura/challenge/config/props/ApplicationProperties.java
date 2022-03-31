package com.thiagoti.alura.challenge.config.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class ApplicationProperties {

    private UrlProperties url;
    
}
