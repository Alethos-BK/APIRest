package br.com.namenotfound.api.model;



public class Produtos {
    
    private Long id;
    private String nome;
    private Integer quantidade;
    private Double valor;
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
