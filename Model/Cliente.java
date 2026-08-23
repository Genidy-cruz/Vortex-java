package com.example.VortexBackEnd.Model;

// Importa as anotações da JPA para o mapeamento da entidade
import jakarta.persistence.*;
// Importa anotações do Lombok para geração automática de métodos
import lombok.*;

// Importa a classe UUID que será usada como tipo do identificador único
import java.util.UUID;

/**
 * Classe abstrata que representa a estrutura base de um Cliente.
 * Pode ser estendida por outras classes que herdarão seus atributos.
 */
@Entity // Indica que esta classe é uma entidade JPA (apesar de abstrata, ainda é persistente)
@Data // Lombok: Gera automaticamente getters, setters, toString, equals e hashCode

public abstract class Cliente {

    @Id // Define o campo como chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) // Gera automaticamente um UUID ao persistir um novo registro
    @Column(nullable = false, length = 100) // Campo obrigatório, com limite de caracteres (embora UUID não use length efetivamente)
    private UUID id;

    @Column(nullable = false, length = 11) // Campo obrigatório, valor único, com limite de 11 caracteres
    private String nome;

    @Column(nullable = false) // Campo obrigatório
    private String email;

    @Column()
    private String descricao;

    @Column(nullable = false) // Campo obrigatório
    private String senha;
}
