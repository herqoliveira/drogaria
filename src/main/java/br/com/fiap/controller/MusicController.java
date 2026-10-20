package br.com.fiap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/music")
public class MusicController {

    @GetMapping
    public String letra(){
        String letra = "<p> Fui no tororó</p>\n<p>beber água, não achei </p>";
        return letra;
    }

}