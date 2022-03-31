package com.thiagoti.alura.challenge.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.thiagoti.alura.challenge.config.props.ApplicationProperties;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class MovieHttpClient implements MovieClient {

    @Autowired
    private ApplicationProperties applicationProperties;
    
    @Override
    public Mono<String> findTop250By() {
        
        WebClient client = WebClient.builder()
                .baseUrl(applicationProperties.getUrl().getMovie().getTop250()).build();
        
        log.info("send call to external api");
        
        return client.get().exchangeToMono(response -> {
            if(response.statusCode().is2xxSuccessful()) {
                return response.bodyToMono(String.class);
            }
            throw new RuntimeException("could not make a resquest to client.");
        });
        
    }

}
