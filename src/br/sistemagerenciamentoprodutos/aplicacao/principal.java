package br.sistemagerenciamentoprodutos.aplicacao;

import br.sistemagerenciamentoprodutos.modelo.Product;
import br.sistemagerenciamentoprodutos.servico.Gerenciador;

public class principal {
    public static void main(String[] args) {

        Product produto1 = new Product(1000, "Doritos", 20, "Salgadinho");
        Product produto2 = new Product(1001, "Ruffles", 15, "Salgadinho");

        System.out.println("------------------");
        produto1.exibDetails();
        System.out.println("------------------");
        produto2.exibDetails();

        Gerenciador gerenciador = new Gerenciador();
        gerenciador.attPrice(produto1, 23);
        gerenciador.attName(produto2, "Elma Chips");

        System.out.println("\nApós a atualização: ");
        produto1.exibDetails();
        System.out.println("------------------");
        produto2.exibDetails();

        System.out.println("-------------------");
        Product.exibirTotProductCad();
    }
}
