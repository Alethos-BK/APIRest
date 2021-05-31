package com.lojinha.namenotfound.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojinha.namenotfound.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    Optional<Cliente> findById(Long id);
}