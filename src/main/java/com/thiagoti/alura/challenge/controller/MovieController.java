package com.thiagoti.alura.challenge.controller;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thiagoti.alura.challenge.client.MovieClient;

@Controller
public class MovieController {

    @Autowired
    private MovieClient movieClient;
    
    @GetMapping(path = "/")
    @ResponseBody
    public String index() {
        return Arrays.asList(movieClient.findTop250By().block().getItems()).stream().map(m -> {
            return new StringBuffer()
                    .append("<ul>")
                        .append("<li>")
                            .append(m.getTitle()).append("</br>")
                            .append("<img src=\"").append(m.getImage()).append("\" width=\"60\" height=\"90\">").append("</br>")
                            .append("Nota: ").append(m.getImDbRating()).append("- Ano: ").append(m.getYear())
                        .append("</li>")
                    .append("</ul").toString();
        }).collect(Collectors.joining());
    }
    
}
