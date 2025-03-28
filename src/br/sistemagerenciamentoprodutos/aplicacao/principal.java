package br.sistemagerenciamentoprodutos.aplicacao;

import br.sistemagerenciamentoprodutos.modelo.Product;
import br.sistemagerenciamentoprodutos.servico.Gerenciador;

public class principal {
    public static void main(String[] args) {

        Product produto1 = new Product();
        Product produto2 = new Product();

        produto1.exibDetails();
        produto2.exibDetails();

        Gerenciador gerenciador = new Gerenciador();
        gerenciador.attPrice(produto1, );
        gerenciador.attName(produto2, );

        System.out.println("\nApós a atualização: ");
        produto1.exibDetails();
        produto2.exibDetails();

        Product.exibirTotProductCad();
    }
}
