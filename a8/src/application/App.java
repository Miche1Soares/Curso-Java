package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        /*
        
        Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
        • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
        • Realizar uma entrada no estoque e mostrar novamente os dados do produto
        • Realizar uma saída no estoque e mostrar novamente os dados do produto

        https://snipboard.io/PEYLRF.jpg

        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        


        Product product = new Product();


        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product.toString());


        System.out.println();
        System.out.print("Add quantity: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Product data: " + product.toString());

        System.out.println();
        System.out.print("Remove quantity: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Product data: " + product.toString());



        sc.close();

    }
}
