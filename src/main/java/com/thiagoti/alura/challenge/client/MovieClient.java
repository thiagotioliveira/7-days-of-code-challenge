package com.thiagoti.alura.challenge.client;

import com.thiagoti.alura.challenge.model.MoviePage;

import reactor.core.publisher.Mono;

public interface MovieClient {

    Mono<MoviePage> findTop250By();
    
}
