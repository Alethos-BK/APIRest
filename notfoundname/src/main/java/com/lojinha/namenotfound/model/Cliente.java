package com.lojinha.namenotfound.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.sun.istack.NotNull;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente{
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
	
    @NotNull
    public String nome;

    @NotNull
    public Integer idade;

    @NotNull
    public String sexo;

    @NotNull
    public String estadoCivil;

    @NotNull
    public String profissao;

    @NotNull
    public String cpfOuCnpj;

    public Cliente(){}

    public Cliente (
        String nome, 
        Integer idade, 
        String sexo, 
        String estadoCivil, 
        String profissao, 
        String cpfOuCnpj){

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer getIdade(){
        return this.idade;
    }

    public void setId(Integer idade){
        this.idade = idade;
    }

    public String getSexo(){
        return this.sexo;
    } 

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil(){
        return this.EstadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil){
        this.EstadoCivil = estadoCivil; 
    }

    public Proficao getProficao(){
        return this.proficao;
    }
    public Proficao setProficao(Proficao proficao){
        this.Proficao = proficao;
    }

    public String getCpfOuCnpj(){
        return this.cpfOuCnpj
    }
    public void setCpfOuCnpj(CpfOuCnpj cpfOuCnpj){
        this.cpfOuCnpj = cpfOuCnpj;
    }

}



