package com.thiagoti.alura.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thiagoti.alura.challenge.client.MovieClient;
import com.thiagoti.alura.challenge.print.Printer;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private Printer printer;
    
    @Autowired
    private MovieClient movieClient;
    
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        printer.print(movieClient.findTop250By());
    }

}
