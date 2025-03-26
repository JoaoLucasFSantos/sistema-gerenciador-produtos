package br.sistemagerenciamentoprodutos.servico;
import br.sistemagerenciamentoprodutos.modelo.Product;

public class Gerenciador {
    public void attPrice(Product produto, double newPrice){
        if (newPrice > 0){
            produto.setPrice(newPrice);
            System.out.println("o valor foi atualizado para: " + newPrice);
        }
        else {
            System.out.println("Valor Invalido!Deve ser maior que 0.");
        }
    }
    public void attName(Product produto, String newName){
        if (newName != null && !newName.trim().isEmpty()){
            produto.setName(newName);
            System.out.println("O nome do produto foi atualizado para: " + newName);
        }
        else {
            System.out.println("Nome Invalido!");
        }
    }
}
