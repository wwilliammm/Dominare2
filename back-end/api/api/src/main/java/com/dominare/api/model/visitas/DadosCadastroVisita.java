package com.dominare.api.model.visitas;

public record DadosCadastroVisita(
    String bloco,
    String numero,
    String nome,
    String cpf,
    String data,
    String numeroParaContato,
    Boolean acessoLivre
) {
    
}
