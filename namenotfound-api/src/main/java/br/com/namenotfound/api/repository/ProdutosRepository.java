/*package br.com.namenotfound.api.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.namenotfound.api.model.Produtos;


public class ProdutosRepository {
	
	private ArrayList<Produtos> produto;
	private Long idInicial = 0L;
	
	public ProdutosRepository() {
		this.produto = new ArrayList<Produtos>();
    }

}
*/

package br.com.namenotfound.api.repository;

import br.com.namenotfound.api.model.Produtos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
    
}