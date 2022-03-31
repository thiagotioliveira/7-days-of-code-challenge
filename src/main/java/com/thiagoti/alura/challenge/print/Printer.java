package com.thiagoti.alura.challenge.print;

import reactor.core.publisher.Mono;

public interface Printer {

    void print(Mono<String> data);
    
}
