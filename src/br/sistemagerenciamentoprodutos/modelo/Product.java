package br.sistemagerenciamentoprodutos.modelo;

public class Product {
    private int id;
    private String name;
    private double price;
    private String category;
    private static int qntProduct;

    static{
        System.out.println("Classe Produto carregada com sucesso!!");
        qntProduct = 0;
    }

    {
        System.out.println("Novo produto criado.");
    }
    public Product(int id, String name, float price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        qntProduct++;
    }
    public static void exibirTotProductCad(){
        System.out.println("Total de produtos cadastrados: " + qntProduct);
    }
    public void exibDetails(){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        System.out.println("ID: " + id);
        System.out.println("Nome: " + name);
        System.out.println("Preço: $" + price);
        System.out.println("Categoria: " + category);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}



