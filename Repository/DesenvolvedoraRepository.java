package com.example.VortexBackEnd.Repository;

// Importa a interface JpaRepository, que fornece métodos prontos para operações CRUD com JPA
import org.springframework.data.jpa.repository.JpaRepository;
// Importa a entidade Desenvolvedora que será gerenciada por este repositório
import com.example.VortexBackEnd.Model.Desenvolvedora;
// Importa a classe UUID, utilizada como identificador único da entidade
import java.util.UUID;

/**
 * Interface de repositório para a entidade Desenvolvedora.
 * Estende JpaRepository, permitindo o uso de métodos prontos para acesso ao banco de dados,
 * como save, findAll, findById, deleteById, entre outros.
 *
 * <Desenvolvedora> é a entidade que será manipulada.
 * <UUID> é o tipo do identificador (chave primária) da entidade.
 */
public interface DesenvolvedoraRepository extends JpaRepository<Desenvolvedora, UUID> {
    // Métodos personalizados podem ser adicionados aqui, se necessário.
    // Exemplo: List<Desenvolvedora> findByNome(String nome);
}
