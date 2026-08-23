package com.example.VortexBackEnd.Controllers;

// Importa a entidade Jogos
import com.example.VortexBackEnd.Model.Jogos;
// Importa o repositório responsável pela persistência da entidade Jogos
import com.example.VortexBackEnd.Repository.JogosRepository;
// Importa anotações e utilitários do Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Controlador REST para gerenciar operações relacionadas à entidade Jogos.
 */
@RestController // Define que esta classe é um controlador REST e os métodos retornam diretamente respostas HTTP (JSON, por exemplo)
@RequestMapping("/jogos") // Define o caminho base para todas as rotas deste controlador (ex: http://localhost:8080/jogos)
public class JogosController {

    @Autowired // Injeta automaticamente uma instância de JogosRepository
    private JogosRepository jogosRepository;

    /**
     * Endpoint GET para listar todos os jogos cadastrados.
     * URL: GET /jogos
     */
    @GetMapping
    public List<Jogos> listarJogos() {
        return jogosRepository.findAll(); // Retorna todos os registros da tabela Jogos
    }

    /**
     * Endpoint GET para buscar um jogo específico pelo ID.
     * URL: GET /jogos/{id}
     * @param id UUID do jogo
     * @return o jogo correspondente ao ID, ou exceção se não encontrado
     */
    @GetMapping("/{id}")
    public Jogos buscarPorId(@PathVariable UUID id) {
        return jogosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jogo não encontrado com o ID: " + id));
    }

    /**
     * Endpoint POST para criar um novo jogo.
     * URL: POST /jogos
     * @param jogo Objeto jogo enviado no corpo da requisição
     * @return o jogo salvo no banco de dados
     */
    @PostMapping
    public Jogos criarJogo(@RequestBody Jogos jogo) {
        return jogosRepository.save(jogo); // Salva e retorna o novo jogo
    }

    /**
     * Endpoint PUT para atualizar um jogo existente pelo ID.
     * URL: PUT /jogos/{id}
     * @param id UUID do jogo a ser atualizado
     * @param jogoAtualizado Dados atualizados enviados no corpo da requisição
     * @return o jogo após a atualização
     */
    @PutMapping("/{id}")
    public Jogos atualizarJogo(@PathVariable UUID id, @RequestBody Jogos jogoAtualizado) {
        return jogosRepository.findById(id)
                .map(jogo -> {
                    // Atualiza os campos do jogo encontrado
                    jogo.setNome(jogoAtualizado.getNome());
                    jogo.setDescricao(jogoAtualizado.getDescricao());
                    jogo.setFavorito(jogoAtualizado.isFavorito());
                    return jogosRepository.save(jogo); // Salva e retorna o jogo atualizado
                })
                .orElseThrow(() -> new RuntimeException("Jogo não encontrado com o ID: " + id));
    }

    /**
     * Endpoint DELETE para remover um jogo pelo ID.
     * URL: DELETE /jogos/{id}
     * @param id UUID do jogo a ser deletado
     */
    @DeleteMapping("/{id}")
    public void deletarJogo(@PathVariable UUID id) {
        jogosRepository.deleteById(id); // Remove o jogo do banco de dados
    }
}
