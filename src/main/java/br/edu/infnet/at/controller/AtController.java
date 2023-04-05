package br.edu.infnet.at.controller;

import br.edu.infnet.at.entity.At;
import br.edu.infnet.at.service.AtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/at")
public class AtController {

    private final AtService atService;

    public AtController(AtService atService) {
        this.atService = atService;
    }

    @GetMapping
    public ResponseEntity<List<At>> buscarTodos() {
        return ResponseEntity.ok(atService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<At> salvar(@RequestBody At at) {
        var novoAt = atService.salvar(at);
        return new ResponseEntity<>(novoAt, null, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        atService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public Optional<At> obterAtPorId(@PathVariable Long id) {
        return atService.buscarAtId(id);
    }

}
