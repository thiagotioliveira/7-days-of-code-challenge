package com.thiagoti.alura.challenge.config.props;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UrlProperties {

    @NotBlank
    private String apiKey;
    
    private MovieProperties movie;
    
}
