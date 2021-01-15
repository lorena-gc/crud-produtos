package com.lgomes;

import com.lgomes.model.Estoque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        while(true) {
            imprimir("====[ Controle de Estoque ]====\n");
            exibirOpcoes();
            String resposta = lerEntrada("\nInforme o número da opção desejada: ");
            estoque = realizarAcao(estoque, resposta);
        }
    }

    private static Estoque realizarAcao(Estoque estoque, String resposta) {
        switch (resposta){
            case "1":
                estoque.cadastrarProduto();
            case "2":
                estoque.alterarProduto();
            case "3":
                estoque.excluirProduto();
            case "4":
                estoque.exibirProduto();
            case "5":
                estoque.listarPorCategoria();
            case "6":
                estoque.listarVencidos();
        }
        return estoque;
    }

    private static void exibirOpcoes() {
        imprimir("1. Cadastrar produto");
        imprimir("2. Alterar produto");
        imprimir("3. Excluir produto");
        imprimir("4. Exibir produto");
        imprimir("5. Listar produtos por categoria");
        imprimir("6. Listar produtos vencidos");
    }

    private static void imprimir(String s) {
        System.out.println(s);
    }

    public static String lerEntrada(String texto){
        Scanner obj = new Scanner(System.in);
        System.out.println(texto);
        return obj.nextLine();
    }

}
