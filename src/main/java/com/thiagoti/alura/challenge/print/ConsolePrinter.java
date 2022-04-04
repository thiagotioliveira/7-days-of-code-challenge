package com.thiagoti.alura.challenge.print;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ConsolePrinter implements Printer {

    @Override
    public void print(String data) {
        log.info("print data in console");
        System.out.println(data);
    }

}
