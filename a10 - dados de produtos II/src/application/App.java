package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price: ");
        double price = sc.nextDouble();

        System.out.println("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);



        product.setName("Computer");
        System.out.println("New name: " + product.getName());



        System.out.println();
        System.out.println("Product data: " + product.toString());


        System.out.println();
        System.out.print("Add quantity: ");
        quantity = sc.nextInt();
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
