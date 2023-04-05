package br.edu.infnet.at.service;

import br.edu.infnet.at.entity.At;
import br.edu.infnet.at.repository.AtRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtService {
    private final AtRepository atRepository;

    public AtService(AtRepository atRepository) {
        this.atRepository = atRepository;
    }

    public List<At> buscarTodos() {
        return atRepository.findAll();
    }

    public At salvar(At at) {
        return atRepository.save(at);
    }

    public void delete(Long id) {
        atRepository.deleteById(id);
    }

    public Optional<At> buscarAtId(Long id) {
        return atRepository.findById(id);
    }

}
