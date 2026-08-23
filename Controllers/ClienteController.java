package com.example.VortexBackEnd.Controllers;

import com.example.VortexBackEnd.Model.Cliente;
import com.example.VortexBackEnd.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Controlador REST para gerenciar operações relacionadas à entidade Cliente.
 */
@RestController // Define esta classe como um controlador REST, que manipula requisições HTTP e retorna respostas JSON
@RequestMapping("/clientes") // Define o caminho base para todos os endpoints deste controlador (ex: http://localhost:8080/clientes)
public class ClienteController {

    @Autowired // Injeta automaticamente a implementação do ClienteRepository para acesso ao banco de dados
    private ClienteRepository clienteRepository;

    /**
     * Endpoint GET para listar todos os clientes cadastrados.
     * URL: GET /clientes
     * @return lista de todos os clientes presentes no banco de dados
     */
    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll(); // Busca e retorna todos os registros da tabela Cliente
    }

}
