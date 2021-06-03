package com.ramvp.farmacia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramvp.farmacia.model.Categoria;
import com.ramvp.farmacia.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> findAll() {

        return repository.findAll();
    }

    public Categoria findById(Long id) {
        Optional<Categoria> a = repository.findById(id);
       if (a.isPresent()) {
           return a.get();
       } else {
           return null;
       }
    }

    public List<Categoria> findByNome(String nome) {

        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public Categoria save(Categoria categoria) {

        return repository.save(categoria);
    }

    public Categoria update(Categoria categoria) {
        if (categoria.getId() != null)
            return repository.save(categoria);
        else
            return null;
    }

    public String delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Categoria Deletada";
        } else {
            return "Categoria Não Existe";
        }
    }

}
