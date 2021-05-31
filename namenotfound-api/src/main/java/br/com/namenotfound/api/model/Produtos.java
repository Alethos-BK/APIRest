package br.com.namenotfound.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "produto")
public class Produtos {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @NotNull
    private String nome;
    
    
    private Integer quantidade;
    
    @NotNull
    private Double valor;
    
    @NotNull
    private String observacao;

    public Produtos(){}

    public Produtos(
        String nome, 
        Integer quantidade, 
        Double valor, 
        String observacao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.observacao = observacao;
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

     public Integer getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }

     public Double getValor(){
        return this.valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

     public String getObservacao(){
        return this.observacao;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }
}
