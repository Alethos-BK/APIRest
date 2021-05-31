package com.lojinha.namenotfound.repository;

import com.lojinha.namenotfound.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
