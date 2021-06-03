package com.ramvp.farmacia.contoller;

import com.ramvp.farmacia.model.Produto;
import com.ramvp.farmacia.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping("/all")
    public ResponseEntity<List<Produto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id) {
        if (service.findById(id) != null) {
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Produto>> findByNome(@PathVariable String nome) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findByNome(nome));
    }

    @PostMapping("/save")
    public ResponseEntity<Produto> save(Produto produto) {
        return ResponseEntity.status(HttpStatus.OK).body(service.save(produto));
    }

    @PutMapping("/update")
    public ResponseEntity<Produto> update(Produto produto) {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(produto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
    }

}
