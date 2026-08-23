package com.example.VortexBackEnd.Controllers;

import com.example.VortexBackEnd.Model.Desenvolvedora;
import com.example.VortexBackEnd.Repository.DesenvolvedoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gerenciar operações relacionadas à entidade Desenvolvedora.
 */
@RestController // Define esta classe como um controlador REST
@RequestMapping("/desenvolvedoras") // Define a URL base para todos os endpoints deste controlador
public class DesenvolvedoraController {

    @Autowired // Injeta a instância do repositório de Desenvolvedora automaticamente
    private DesenvolvedoraRepository desenvolvedoraRepository;

    /**
     * Endpoint GET para listar todas as desenvolvedoras cadastradas.
     * URL: GET /desenvolvedoras
     * @return lista de todas as desenvolvedoras no banco de dados
     */
    @GetMapping
    public List<Desenvolvedora> listarDesenvolvedoras() {
        return desenvolvedoraRepository.findAll(); // Busca e retorna todas as desenvolvedoras
    }
}
