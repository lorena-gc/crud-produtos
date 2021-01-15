package com.lgomes.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Estoque {

    private List<Produto> produtos = new ArrayList<>();

    public Estoque() {
    }

    public void listarVencidos() {
        //TODO: Implementar a listagem de produtos que estão vencidos
    }

    public void listarPorCategoria() {
        //TODO: Implementar a listagem de produtos por categoria
    }

    public void exibirProduto() {
        //TODO: Implementar a exibição de um produto na lista de produtos definida na linha 8
    }

    public void excluirProduto() {
        //TODO: Implementar a exclusão de um produto na lista de produtos definida na linha 8
    }

    public void alterarProduto() {
        //TODO: Implementar a alteração de um produto na lista de produtos definida na linha 8
    }

    public void cadastrarProduto() {
        //TODO: Implementar a inclusão de um produto na lista de produtos definida na linha 8
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        String nome = lerEntrada("\nInforme o nome do produto:");
        Double preço = Double.parseDouble(lerEntrada("\nInforme o preço do produto:"));
        String marca = lerEntrada("\nInforme a marca do produto:");
        String categoria = lerEntrada("\nInforme a categoria do produto:");
        Date validade = new Date(2050,1,1);
        try {
            validade = formato.parse(lerEntrada("\nInforme a data de validade do produto:"));
        } catch (ParseException e) {
            System.out.println("Data inválida. Favor voltar no menu e alterar a data de validade cadastrada");
        }
        Produto produto = new Produto(nome,preço,marca,categoria,validade);
        produtos.add(produto);
    }

    private String lerEntrada(String texto){
        Scanner obj = new Scanner(System.in);
        System.out.println(texto);
        return obj.nextLine();
    }

}
