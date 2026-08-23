package com.example.VortexBackEnd.Controllers;

// Importa a entidade Loja
import com.example.VortexBackEnd.Model.Loja;
// Importa o repositório responsável pela persistência da entidade Loja
import com.example.VortexBackEnd.Repository.LojaRepository;

import org.springframework.beans.factory.annotation.Autowired; // Para injeção de dependência automática
import org.springframework.web.bind.annotation.*; // Para anotações REST

import java.util.List;

/**
 * Controlador REST para gerenciar operações relacionadas à entidade Loja.
 */
@RestController // Indica que esta classe será um controlador REST, capaz de responder a requisições HTTP
@RequestMapping("/Loja") // Define o caminho base para as requisições deste controlador (ex: http://localhost:8080/Loja)
public class LojaController {

    @Autowired // Injeção automática da dependência do repositório LojaRepository
    private LojaRepository lojaRepository;

    /**
     * Endpoint HTTP GET que retorna todas as lojas cadastradas.
     * URL: GET /Loja
     *
     * @return Lista de todas as lojas presentes no banco de dados
     */
    @GetMapping
    public List<Loja> mostrarLoja() {
        return lojaRepository.findAll(); // Retorna todos os registros da tabela Loja
    }
}
