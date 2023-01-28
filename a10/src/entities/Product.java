package entities;

public class Product {
    
    private String name;
    private double price;
    private int quantity;


    //construtor padrão - para voltar a possibilidade de instanciar a classe sem inserir informações
    public Product(){}

    //construtor
    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //segundo construtor - possibilita inserir apenas 2 parametros
    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }






    //encapsulamento
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }





    public double totalValueInStock()
    {
        return quantity * price;
    }

    public void addProducts(int quantity)
    {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity)
    {
        this.quantity -= quantity;
    }

    public String toString()
    {
        return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total $ "
        + String.format("%.2f", totalValueInStock());
    }

}
