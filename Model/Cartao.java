package com.example.VortexBackEnd.Model;

// Importa as anotações JPA para o mapeamento da entidade com o banco de dados
import jakarta.persistence.*;
// Importa UUID para ser usado como identificador único da entidade
import java.util.UUID;
// Importa anotações do Lombok para geração automática de métodos
import lombok.*;

/**
 * Classe que representa a entidade Cartao, que será mapeada para uma tabela no banco de dados.
 */
@Entity // Indica que esta classe é uma entidade JPA
@Data // Lombok: Gera automaticamente getters, setters, equals, hashCode e toString
public class Cartao {

    @Id // Define este campo como a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.AUTO) // Geração automática de UUID como identificador único
    @Column(nullable = false, length = 100) // Campo obrigatório e com tamanho máximo definido (embora UUID não use length na prática)
    private UUID id;

    @Column(nullable = false, length = 11, unique = true) // Nome no cartão, obrigatório, único e com limite de 11 caracteres
    private String nomeNoCartao;

    @Column(nullable = false) // Código de verificação (CVV), campo obrigatório
    private String cvv;

    @Column(nullable = false) // Número do cartão, campo obrigatório
    private String numeroDoCartao;

    @Column(nullable = false) // Bandeira do cartão (Visa, MasterCard, etc.), campo obrigatório
    private String bandeira;

    public String getNomeNoCartao() {
        return nomeNoCartao;
    }

    public void setNomeNoCartao(String nomeNoCartao) {
        this.nomeNoCartao = nomeNoCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public UUID getId() {
        return id;
    }
}
