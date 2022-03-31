package com.thiagoti.alura.challenge.print;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class ConsolePrinter implements Printer {

    @Override
    public void print(Mono<String> data) {
        log.info("print data in console");
        String json = data.block();
        System.out.println(json);
    }

}
