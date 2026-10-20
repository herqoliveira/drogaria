package br.com.fiap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping
    public String dados(){
        String dados = "<p> RM: 566424</p>\n";
        dados += "<p>Nome: Henrique de Oliveira</p>\n";
        dados += "<p>Disciplina: Engenharia de Software</p>\n";
        dados += "<p>Nota média: 10.0</p>";
        return dados;
    }

}