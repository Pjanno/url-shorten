package br.pjanno.shortener.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShortenerController {

    @GetMapping("/{id}")
    @ResponseBody
    public String goTo(@PathVariable String id){
        // search the link on DB
        // exceptions treatment
        // return the extended link
        return "www.google.com";
    }

    @PostMapping("/{id}")
    @ResponseBody
    public String shorten(@PathVariable String id){
        // service to shorten

        return "www.google.com";
    }

}
