/*package br.com.namenotfound.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("./api/produtos")
public class ProdutosController {
	

}*/

package br.com.namenotfound.api.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.namenotfound.api.model.Produtos;
import br.com.namenotfound.api.repository.ProdutosRepository;

@RestController
@RequestMapping("./api/produtos")
public class ProdutosController {
    
	@Autowired
	private ProdutosRepository _repositorioProduto;
	
	@GetMapping
	public List<Produtos> obterTodos(){
		return this._repositorioProduto.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Produtos> obter(@PathVariable(value = "id") Long id){
		return this._repositorioProduto.findById(id);
	}
	
	@PostMapping
	public Produtos adicionar(@RequestBody Produtos produto) {
		return this._repositorioProduto.save(produto);
	}
	
	@PutMapping("/{id}")
	public Produtos atualizar(@PathVariable(value = "id") Long id, @RequestBody Produtos produto) {
		produto.setId(id);
		
		return this._repositorioProduto.save(produto);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable(value = "id") Long id, @RequestBody Produtos produto) {
		this._repositorioProduto.deleteById(id);
	}
}