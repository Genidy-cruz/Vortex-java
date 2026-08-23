package com.example.VortexBackEnd.Repository;

// Importa a interface JpaRepository do Spring Data JPA
import org.springframework.data.jpa.repository.JpaRepository;
// Importa a entidade Loja
import com.example.VortexBackEnd.Model.Loja;
// Importa a classe UUID para uso como tipo de identificador
import java.util.UUID;

/**
 * Interface responsável por acessar e manipular dados da entidade Loja no banco de dados.
 * Estende JpaRepository, o que fornece uma série de métodos prontos como:
 * findAll(), findById(), save(), deleteById(), etc.
 */
public interface LojaRepository extends JpaRepository<Loja, UUID> {
    // Nenhum método adicional é necessário aqui, pois os métodos padrão do JpaRepository são suficientes para operações básicas
}
