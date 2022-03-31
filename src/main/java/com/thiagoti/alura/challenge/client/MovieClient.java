package com.thiagoti.alura.challenge.client;

import reactor.core.publisher.Mono;

public interface MovieClient {

    Mono<String> findTop250By();
    
}
