package com.example.VortexBackEnd.Repository;

// Importa a interface JpaRepository que fornece métodos CRUD e funcionalidades adicionais para acesso a dados
import org.springframework.data.jpa.repository.JpaRepository;
// Importa a entidade Cartao que será manipulada por este repositório
import com.example.VortexBackEnd.Model.Cartao;
// Importa a classe UUID, que será usada como tipo do identificador único da entidade Cartao
import java.util.UUID;

/**
 * Interface de repositório para a entidade Cartao.
 * Estende JpaRepository, o que permite realizar operações de banco de dados como salvar, buscar, atualizar e deletar.
 *
 * <Cartao> é a entidade associada.
 * <UUID> é o tipo da chave primária usada na entidade Cartao.
 */
public interface CartaoRepository extends JpaRepository<Cartao, UUID> {
    // Métodos de consulta personalizados podem ser definidos aqui, se necessário.
    // Exemplo: List<Cartao> findByNumero(String numero);
}
