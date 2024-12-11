package com.dominare.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.dominare.api.model.pessoa.PessoaModel;
import com.dominare.api.model.pessoa.PessoaRepository;

import jakarta.transaction.Transactional;

@RequestMapping("/pessoa")
@Controller

public class PessoaController {

    @Autowired
    private PessoaRepository repository;
    
    // MÉTODOS HTTPS
    
    // Get
    @GetMapping("/")
    public String listarPessoas (Model model){
        model.addAttribute("pessoas", repository.findAll());
        return "pessoa/listarPessoas";
    }

    @GetMapping("/cadastrar")
    public String mostrarFormulario (Model model){
        model.addAttribute("pessoa", new PessoaModel());
        return "pessoa/cadastroPessoa";
    }

    // Post
    // @PostMapping("/cadastroPessoa")
    @PostMapping("/cadastrar")
    @Transactional
    public String salvarPessoa(@ModelAttribute PessoaModel pessoa) {
        repository.save(pessoa);
        return "redirect:/pessoa/cadastrar";
}



    // Put

    // Delete

}
