package com.dominare.api.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dominare.api.model.visitas.VisitasModel;
import com.dominare.api.model.visitas.VisitasRepository;

import jakarta.transaction.Transactional;


@RestController
@RequestMapping("/visita")

public class VisitaController {
    @Autowired
    private VisitasRepository repository;


    @GetMapping("/")
    public String listarVisitas(Model model){
        model.addAttribute("visitas", repository.findAll());
        return "listarVisitas";
    }

    @GetMapping("/cadastrar")
    public String mostrarFormulario(Model model){
        model.addAttribute("visita", new VisitasModel());
        return "cadastroVisitas";
    }

    @PostMapping
    @Transactional
    public String cadastrarVisita (VisitasModel visita){
        repository.save(visita);
        return "redirect:/";
    }
    
    
}
