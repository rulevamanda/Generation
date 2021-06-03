package com.ramvp.farmacia.contoller;

import com.ramvp.farmacia.model.Categoria;
import com.ramvp.farmacia.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping("/all")
    public ResponseEntity<List<Categoria>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id) {
        if (service.findById(id) != null) {
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Categoria>> findByNome(@PathVariable String nome) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findByNome(nome));
    }

    @PostMapping("/save")
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria) {
        return ResponseEntity.status(HttpStatus.OK).body(service.save(categoria));
    }

    @PutMapping("/update")
    public ResponseEntity<Categoria> update(@RequestBody Categoria categoria) {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(categoria));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
    }

}
