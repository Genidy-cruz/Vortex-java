package com.example.VortexBackEnd.Model;

// Importa as anotações da JPA para o mapeamento da entidade
import jakarta.persistence.*;
// Importa UUID para ser utilizado como tipo de identificador único
import java.util.UUID;
// Importa anotações do Lombok para geração automática de métodos e construtor
import lombok.*;

/**
 * Classe que representa a entidade Desenvolvedora.
 * Será mapeada como uma tabela no banco de dados.
 */
@Entity // Indica que esta classe é uma entidade JPA
@Data // Lombok: Gera automaticamente getters, setters, toString, equals e hashCode
@NoArgsConstructor // Lombok: Gera um construtor sem argumentos
public class Desenvolvedora {

    @Id // Define o campo como chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) // Gera automaticamente o UUID ao salvar um novo registro
    @Column(nullable = false, length = 100) // Define que o campo é obrigatório e com tamanho máximo (embora UUID não use length na prática)
    private UUID id;

    @Column(nullable = false, length = 11, unique = true) // Campo obrigatório, valor único e com limite de 11 caracteres
    private String nome;

    @Column(nullable = false) // Campo obrigatório
    private String email;

    @Column(nullable = false) // Campo obrigatório
    private String representante;

    @Column(nullable = false) // Campo obrigatório
    private String locacao; // Endereço da desenvolvedora

    @Column(nullable = false) // Campo obrigatório
    private String cnpj; // Cadastro Nacional de Pessoa Jurídica
}
