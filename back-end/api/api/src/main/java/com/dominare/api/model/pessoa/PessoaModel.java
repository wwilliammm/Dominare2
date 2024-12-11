package com.dominare.api.model.pessoa;




import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pessoas")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "id")
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dataDeNascimento;
    private String cpf;
    private String telefone;
    private String bloco;
    private String numeroApartamento;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "apartamento", nullable = false)
    // // @Embedded
    // private ApartamentoModel apartamento;

    @Enumerated(EnumType.STRING)
    private Relacao relacao;

    public PessoaModel(DadosCadastrosPessoa dados) {
        this.nome = dados.nome();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.cpf = dados.cpf();
        this.telefone = dados.telefone();
        this.bloco = dados.bloco();
        this.numeroApartamento = dados.numeroApartamento();
        // this.relacao = dados.relacao();
        // this.apartamento = new ApartamentoModel(dados.apartamento());
    }
}
