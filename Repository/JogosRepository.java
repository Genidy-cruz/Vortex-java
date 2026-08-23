package com.example.VortexBackEnd.Repository;

// Importa a entidade Jogos que será manipulada pelo repositório
import com.example.VortexBackEnd.Model.Jogos;
// Importa a interface JpaRepository que fornece operações CRUD e outras funcionalidades JPA
import org.springframework.data.jpa.repository.JpaRepository;
// Importa a anotação @Repository para indicar que esta interface é um componente de repositório do Spring
import org.springframework.stereotype.Repository;

import java.util.UUID; // Importa a classe UUID, usada como tipo de identificador único da entidade

/**
 * Interface de repositório para a entidade Jogos.
 * Estende JpaRepository, fornecendo métodos prontos para operações como salvar, buscar, deletar, etc.
 * O primeiro parâmetro (Jogos) é o tipo da entidade.
 * O segundo parâmetro (UUID) é o tipo da chave primária da entidade.
 */
@Repository // Indica que esta interface é um bean de repositório gerenciado pelo Spring
public interface JogosRepository extends JpaRepository<Jogos, UUID> {
    // Nenhum método adicional é necessário neste momento,
    // pois JpaRepository já fornece todos os métodos CRUD básicos.
}
