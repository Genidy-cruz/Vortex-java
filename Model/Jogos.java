package com.example.VortexBackEnd.Model;

// Importa as anotações JPA para mapeamento da entidade com o banco de dados
import jakarta.persistence.*;
// Importa anotações do Lombok para geração automática de métodos como getters, setters, construtores, etc.
import lombok.*;

import java.util.UUID; // Importa UUID para ser usado como identificador único da entidade

/**
 * Classe que representa a entidade Jogos, mapeada para uma tabela no banco de dados.
 */
@Entity // Indica que esta classe é uma entidade JPA e será mapeada para uma tabela no banco de dados
@Data // Lombok: Gera automaticamente getters, setters, equals, hashCode e toString
@NoArgsConstructor // Lombok: Gera um construtor sem argumentos
@AllArgsConstructor // Lombok: Gera um construtor com todos os argumentos
@Builder // Lombok: Permite construir objetos usando o padrão Builder
public class Jogos {

    @Id // Indica que este campo é a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.AUTO) // Gera automaticamente um UUID ao salvar um novo objeto
    @Column(nullable = false, updatable = false) // Define que o campo não pode ser nulo e não pode ser alterado após criado
    private UUID id;

    @Column(nullable = false, unique = true) // Campo obrigatório e com valor único (não pode haver dois jogos com o mesmo nome)
    private String nome;

    @Column(nullable = false, length = 1000) // Campo obrigatório e com limite de 1000 caracteres
    private String descricao;

    @Column(nullable = false) // Campo obrigatório (true ou false)
    private boolean favorito = false; // Valor padrão é false (não favorito)

    @Column(nullable = false, length = 1000) // Campo obrigatório. Obs: a anotação length aqui não afeta tipos numéricos como double
    private double valor;

    @Column(nullable = false, length = 1000) // Campo obrigatório com limite de 1000 caracteres
    private String desenvolvedora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public UUID getId() {
        return id;
    }
}
