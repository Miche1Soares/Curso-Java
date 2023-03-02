package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductService;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product ("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Headset", 80.0));

        ProductService ps = new ProductService();

        double sum = ps.filterredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));        

    }
}
