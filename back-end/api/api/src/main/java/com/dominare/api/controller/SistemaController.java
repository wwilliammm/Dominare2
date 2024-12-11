package com.dominare.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sistema")
public class SistemaController {
    
    // PAGINA PRINCIPAL DO SISTEMA
    @GetMapping
    public String carregarPaginaSistema() {
        return "sistema/model-sidebar";
    }

    // PÁGINA PRINCIPAL MORADORES
    @GetMapping("/morador") 
    public String carregaPaginaMoradores() {
        return "sistema/morador/morador";
    }

    // PÁGINA DE CADASTRO MORADORES
    @GetMapping("/morador/cadastro") 
    public String carregaPaginaCadastraMorador() {
        return "sistema/morador/cadastro_morador/cadastro_morador";
    }

    // PÁGINA PRINCIPAL VISITANTES
    @GetMapping("/visitante") 
    public String carregaPaginaVisitantes() {
        return "sistema/visitante/visitante";
    }

    // PÁGINA DE CADASTRO VISITANTES
    @GetMapping("/visitante/cadastro") 
    public String carregaPaginaCadastraVisitante() {
        return "sistema/visitante/cadastro_visitante/cadastro_visitante";
    }

    // PÁGINA PRINCIPAL DO FINANCEIRO 
    @GetMapping("/financeiro")  
    public String carregaPaginaFinanceiro() {
        return "sistema/financeiro/financeiro";
    }

    // PÁGINA PRINCIPAL DO QUADRO DE AVISOS
    @GetMapping("/avisos")   
    public String carregaPaginaAvisos() {
        return "sistema/quadro_de_avisos/quadro_de_avisos";
    }

    // PÁGINA PRINCIPAL DA VOTAÇÃO
    @GetMapping("/votacao")   
    public String carregaPaginaVotacao() {
        return "sistema/votacao/votacao";
    }
}
