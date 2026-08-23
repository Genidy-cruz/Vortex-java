package com.example.VortexBackEnd;

// Importa a classe SpringApplication responsável por iniciar a aplicação Spring Boot
import org.springframework.boot.SpringApplication;
// Importa a anotação que configura a aplicação como uma aplicação Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Importa a anotação para especificar onde estão as entidades JPA
import org.springframework.boot.autoconfigure.domain.EntityScan;
// Importa a anotação que habilita os repositórios JPA e define o pacote onde estão localizados
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Classe principal que inicializa a aplicação Spring Boot.
 */
@SpringBootApplication // Marca esta classe como a aplicação principal do Spring Boot
@EntityScan("com.example.VortexBackEnd.Model") // Define o pacote onde estão as entidades JPA (classes anotadas com @Entity)
@EnableJpaRepositories("com.example.VortexBackEnd.Repository") // Define o pacote onde estão os repositórios JPA (interfaces que estendem JpaRepository ou CrudRepository)
public class VortexBackEndApplication {

	/**
	 * Método principal que executa a aplicação.
	 * @param args argumentos de linha de comando (se houver)
	 */
	public static void main(String[] args) {
		SpringApplication.run(VortexBackEndApplication.class, args); // Inicia a aplicação Spring Boot
	}
}
