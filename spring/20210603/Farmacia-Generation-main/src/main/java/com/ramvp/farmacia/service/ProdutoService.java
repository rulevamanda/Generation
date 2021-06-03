package com.ramvp.farmacia.service;

import com.ramvp.farmacia.model.Produto;
import com.ramvp.farmacia.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll() {
        return repository.findAll();
    }

    public Produto findById(Long id) {
        Optional<Produto> a = repository.findById(id);
        if (a.isPresent()) {
            return a.get();
        } else {
            return null;
        }
    }

    public List<Produto> findByNome(String nome) {

        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public Produto save(Produto produto) {

        return repository.save(produto);
    }

    public Produto update(Produto produto) {
        if (produto.getId() != null)
            return repository.save(produto);
        else
            return null;
    }

    public String delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Produto Deletado";
        } else {
            return "Produto Não Existe";
        }
    }

}
