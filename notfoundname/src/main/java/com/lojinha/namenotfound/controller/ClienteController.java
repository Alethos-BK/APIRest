package com.lojinha.namenotfound.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository _clienteRepository;

    @GetMapping
    public List<Cliente> obter(){
        return this._clienteRepository.findAll();
        
    }
    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cliente){
        return this._clienteRepository.save(Cliente);
    }


    @GetMapping(value = "/{id}")
    public Optional<Cliente> obter(@PathVariable(value = "id") Long id){
        return this._clienteRepository.findById(id);
    }

    public Cliente atualizar(@PathVariable (value = "id")


    
    
}
