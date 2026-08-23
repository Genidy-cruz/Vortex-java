package com.example.VortexBackEnd.Repository;

// Importa a interface JpaRepository, que fornece métodos prontos para operações com o banco de dados (CRUD)
import org.springframework.data.jpa.repository.JpaRepository;
// Importa a entidade Cliente do pacote Model
import com.example.VortexBackEnd.Model.*;
// Importa a classe UUID, usada como tipo do identificador único (chave primária) da entidade Cliente
import java.util.UUID;

/**
 * Interface de repositório para a entidade Cliente.
 * Estende JpaRepository, permitindo acesso automático a métodos como salvar, buscar, deletar, etc.
 *
 * <Cliente> é a entidade que será manipulada.
 * <UUID> é o tipo do identificador único usado pela entidade Cliente.
 */
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    // Métodos personalizados podem ser adicionados aqui conforme necessário.
    // Exemplo: List<Cliente> findByNome(String nome);
}
