package com.lgomes.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Estoque {

    private List<Produto> produtos = new ArrayList<>();

    public Estoque() {
    }

    public void listarVencidos() {
    	imprimir("\nProdutos vencidos:");
    	LocalDate hoje = LocalDate.now();
        for(Produto prod:produtos) {
        	if(prod.getValidade().isBefore(hoje)) {
        		 imprimir(prod.toString());
        	}
        }
    }

    public void listarPorCategoria() {
    	String categoriaInformada = lerEntrada("\nInforme a categoria a ser exibida:");
        for(Produto prod:produtos) {
        	if(prod.getCategoria().equals(categoriaInformada)) {
        		 imprimir(prod.toString());
        	}
        }
    }

    public void exibirProduto() {
    	int codigoInformado = Integer.valueOf(lerEntrada("\nInforme o código do produto  a ser exibido:"));
        for(Produto prod:produtos) {
        	if(prod.getCodigo()==(codigoInformado)) {
        		 imprimir(prod.toString());
        	}
        }
    }

    public void excluirProduto() {
    	int produtoExcluir = Integer.valueOf(lerEntrada("\nInforme o código do produto a ser excluido:"));
        int index = Integer.MAX_VALUE;
    	for(Produto prod:produtos) {
        	if(prod.getCodigo()==(produtoExcluir)) {
        		 imprimir(prod.toString());
        		 index = produtos.indexOf(prod);
        	}
        }
    	if(index!=Integer.MAX_VALUE){
    		int confirmarExclusao = Integer.valueOf(lerEntrada("\nConfirma a exclusão do item:\nDigite 1-Sim ou 2-Não"));
    		switch(confirmarExclusao){
        		case (1):
        			produtos.remove(index);
        			imprimir("Produto excluído com sucesso.");
        			break;
        		case (2):
        			imprimir("Produto não excluído.");
        			break;
        		default:
        			imprimir("Opção inválida.");
        			break;	
    		}
    	}else {
    		imprimir("Código não encontrado.");
    	}
   }

    public void alterarProduto() {
    	int produtoAlterar = Integer.valueOf(lerEntrada("\nInforme o código do produto a ser alterado:"));
        for(Produto prod:produtos) {
        	if(prod.getCodigo()==(produtoAlterar)) {
        		 String nome = lerEntrada("\nDigite o novo nome do produto");
        		 if(!nome.isEmpty()) {
        			 prod.setNome(nome);
        		 }
        		 Double preco = Double.parseDouble(lerEntrada("\nDigite o novo preco do produto"));
        		 if(preco!=null) {
        			 prod.setPreco(preco);
        		 }
        		 String marca = lerEntrada("\nDigite a nova marca do produto");
        		 if(!marca.isEmpty()) {
        			 prod.setMarca(marca);
        		 }
        		 String categoria = lerEntrada("\nDigite a nova categoria do produto");
        		 if(!categoria.isEmpty()) {
        			 prod.setCategoria(categoria);
        		 }
        		 LocalDate validade = LocalDate.parse(lerEntrada("\nDigite a nova validade (ano/mês/dia) do produto"));
        		 if(validade!=null) {
        			 prod.setValidade(validade);
        		 }
        	}
        }
    }

    public void cadastrarProduto() {
		/*
		 * SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		 * 
		 * String nome = lerEntrada("\nInforme o nome do produto:"); Double preco =
		 * Double.parseDouble(lerEntrada("\nInforme o preco do produto:(Exemplo 1.00)"))
		 * ; String marca = lerEntrada("\nInforme a marca do produto:"); String
		 * categoria = lerEntrada("\nInforme a categoria do produto:"); Date validade =
		 * null; try { validade =
		 * formato.parse(lerEntrada("\nInforme a data de validade do produto:")); }
		 * catch (ParseException e) { System.out.
		 * println("Data invalida. Favor voltar no menu e alterar a data de validade cadastrada"
		 * ); } Produto produto = new Produto(nome,preco,marca,categoria,validade);
		 * produtos.add(produto);
		 */

        Produto produto1 = new Produto(1,"Leite",3.55,"Itambe","Bebidas", LocalDate.of(2021,5,04));
        Produto produto2 = new Produto(2,"Agua",2.00,"Inga","Bebidas", LocalDate.of(2022,5,13));
        Produto produto3 = new Produto(3,"Suco",5.00,"DelVale","Bebidas", LocalDate.of(2021,8,13));
        Produto produto4 = new Produto(4,"Biscoito",1.55,"Liane","Alimentos", LocalDate.of(2023,5,13));
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
        imprimir("Produto cadastrado com sucesso!"); 
    }

    private String lerEntrada(String texto){
        Scanner obj = new Scanner(System.in);
        System.out.println(texto);
        return obj.nextLine();
    }
    private static void imprimir(String s) {
        System.out.println(s);
    }

}
