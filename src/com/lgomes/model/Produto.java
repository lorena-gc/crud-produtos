package com.lgomes.model;

import java.util.Date;

public class Produto {

    private String nome;
    private Double preço;
    private String marca;
    private String categoria;
    private Date validade;

    public Produto(String nome, Double preço, String marca, String categoria, Date validade) {
        this.nome = nome;
        this.preço = preço;
        this.marca = marca;
        this.categoria = categoria;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
}
