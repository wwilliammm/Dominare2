package com.dominare.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dominare.api.model.apartamento.ApartamentoModel;
import com.dominare.api.model.apartamento.ApartamentoRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/apartamento")

public class ApartamentoController {
    
    @Autowired
    private ApartamentoRepository repository;
    
    @GetMapping("/")

    public String listarVisitas(Model model){
        model.addAttribute("apartamento", repository.findAll());
        return "listarApartamento";
    }

    @GetMapping("/cadastrar")
    public String mostrarFormulario(Model model){
        return "cadastroApartamento";
    }

    @PostMapping
    @Transactional
    public String cadastrarApartamento (ApartamentoModel apartamento){
        repository.save(apartamento);
        return "redirect:/";
    }

}
