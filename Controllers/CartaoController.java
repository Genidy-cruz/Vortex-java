package com.example.VortexBackEnd.Controllers;

import com.example.VortexBackEnd.Model.Cartao;
import com.example.VortexBackEnd.Repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Controlador REST para operações relacionadas à entidade Cartao.
 */
@RestController // Indica que esta classe é um controlador REST e os métodos retornam dados JSON
@RequestMapping("/cartoes") // Define o caminho base para os endpoints (ex: http://localhost:8080/cartoes)
public class CartaoController {

    @Autowired // Injeta a implementação do CartaoRepository para acesso ao banco de dados
    private CartaoRepository cartaoRepository;

    /**
     * GET /cartoes
     * Lista todos os cartões cadastrados.
     * @return Lista de cartões
     */
    @GetMapping
    public List<Cartao> listarCartoes() {
        return cartaoRepository.findAll();
    }

    /**
     * GET /cartoes/{id}
     * Busca um cartão pelo seu ID.
     * @param id UUID do cartão a ser buscado
     * @return Cartão encontrado ou 404 caso não exista
     */
    @GetMapping("/{id}")
    public ResponseEntity<Cartao> obterCartao(@PathVariable UUID id) {
        Optional<Cartao> cartao = cartaoRepository.findById(id);
        return cartao.map(ResponseEntity::ok) // Se encontrado, retorna status 200 com o cartão
                .orElseGet(() -> ResponseEntity.notFound().build()); // Se não encontrado, retorna 404
    }

    /**
     * POST /cartoes
     * Cria um novo cartão.
     * @param cartao Objeto Cartao enviado no corpo da requisição
     * @return Cartão criado ou 400 se dados obrigatórios estiverem ausentes
     */
    @PostMapping
    public ResponseEntity<Cartao> criarCartao(@RequestBody Cartao cartao) {
        // Validação simples: verifica se os campos nomeNoCartao e numeroDoCartao não são nulos
        if (cartao.getNomeNoCartao() == null || cartao.getNumeroDoCartao() == null) {
            return ResponseEntity.badRequest().build(); // Retorna 400 Bad Request se dados inválidos
        }
        Cartao novoCartao = cartaoRepository.save(cartao); // Salva o cartão no banco
        return ResponseEntity.ok(novoCartao); // Retorna o cartão criado com status 200
    }

    /**
     * DELETE /cartoes/{id}
     * Remove um cartão pelo ID.
     * @param id UUID do cartão a ser removido
     * @return 204 No Content se removido, 404 se não encontrado
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCartao(@PathVariable UUID id) {
        if (!cartaoRepository.existsById(id)) {
            return ResponseEntity.notFound().build(); // Retorna 404 se o cartão não existir
        }
        cartaoRepository.deleteById(id); // Remove o cartão do banco
        return ResponseEntity.noContent().build(); // Retorna 204 No Content após exclusão
    }
}
