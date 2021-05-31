package br.com.namenotfound.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.namenotfound.api.model.Cliente;
import br.com.namenotfound.api.repository.ClienteRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository _clienteRepository;

	@GetMapping
	public List<Cliente> obter() {
		return this._clienteRepository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Cliente> obter(@PathVariable(value = "id") Long id) {
		return this._clienteRepository.findById(id);
	}
	

	@PostMapping
	public ResponseEntity<Cliente> adicionar(@RequestBody Cliente cliente) {
		return new ResponseEntity<Cliente>(_clienteRepository.save(cliente), HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}")
	public Cliente atualizar(@PathVariable(value = "id") Long id, @RequestBody Cliente cliente) {
		cliente.setId(id);
		return this._clienteRepository.save(cliente);
	}

	@DeleteMapping(value = "/{id}")
	public void apagar(@PathVariable(value = "id") Long id) {
		this._clienteRepository.deleteById(id);
	}
}