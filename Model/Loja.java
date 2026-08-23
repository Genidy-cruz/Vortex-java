package com.example.VortexBackEnd.Model;

// Importa as anotações da JPA para o mapeamento da entidade
import jakarta.persistence.*;
// Importa UUID para ser utilizado como tipo de identificador único
import java.util.UUID;
// Importa anotações do Lombok para geração automática de métodos e construtores
import lombok.*;

@Entity // Indica que esta classe representa uma entidade no banco de dados
@Data // Lombok: Gera automaticamente os métodos getters, setters, toString, equals e hashCode
@NoArgsConstructor // Lombok: Gera um construtor sem argumentos
public class Loja {

    @Id // Define o campo como a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.AUTO) // Gera automaticamente um UUID ao criar uma nova instância
    @Column(nullable = false, length = 100) // Define que o campo é obrigatório (não pode ser nulo) e com limite de comprimento
    private UUID id; // Identificador único da loja

    @Column(nullable = false, length = 11, unique = true) // Campo obrigatório, único, com tamanho máximo de 11 caracteres
    private String nome; // Nome da loja

    @Column(nullable = false) // Campo obrigatório
    private String email; // E-mail de contato da loja

    @Column(nullable = false) // Campo obrigatório
    private String representante; // Nome do representante da loja

    @Column(nullable = false) // Campo obrigatório
    private String locacao; // Endereço físico da loja

    @Column(nullable = false) // Campo obrigatório
    private String cnpj; // Cadastro Nacional da Pessoa Jurídica (identificação fiscal da loja)
}
