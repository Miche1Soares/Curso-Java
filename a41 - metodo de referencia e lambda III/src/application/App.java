package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product ("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Headset", 80.0));

        // executa uma ação a cada item da lista
        list.forEach(new PriceUpdate());

        list.forEach(System.out::println);
        System.out.println();





        // reference method com método estático
        List<Product> list2 = new ArrayList<>();

        list2.add(new Product("TV", 900.0));
        list2.add(new Product ("Notebook", 1200.0));
        list2.add(new Product("Tablet", 400.0));
        list2.add(new Product("Mouse", 50.0));
        list2.add(new Product("Headset", 80.0));

        // executa uma ação a cada item da lista
        list2.forEach(Product::staticPriceUpdate);

        list2.forEach(System.out::println);
        System.out.println();





        // reference method com método não estático
        List<Product> list3 = new ArrayList<>();

        list3.add(new Product("TV", 900.0));
        list3.add(new Product ("Notebook", 1200.0));
        list3.add(new Product("Tablet", 400.0));
        list3.add(new Product("Mouse", 50.0));
        list3.add(new Product("Headset", 80.0));

        // executa uma ação a cada item da lista
        list3.forEach(Product::nonStaticPriceUpdate);

        list3.forEach(System.out::println);
        System.out.println();





        // reference method com expressão lambda declarada
        List<Product> list4 = new ArrayList<>();

        list4.add(new Product("TV", 900.0));
        list4.add(new Product ("Notebook", 1200.0));
        list4.add(new Product("Tablet", 400.0));
        list4.add(new Product("Mouse", 50.0));
        list4.add(new Product("Headset", 80.0));

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };

        list4.forEach(cons);

        list4.forEach(System.out::println);
        System.out.println();





        // reference method com expressão lambda declarada
        List<Product> list5 = new ArrayList<>();

        list5.add(new Product("TV", 900.0));
        list5.add(new Product ("Notebook", 1200.0));
        list5.add(new Product("Tablet", 400.0));
        list5.add(new Product("Mouse", 50.0));
        list5.add(new Product("Headset", 80.0));

        list5.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list5.forEach(System.out::println);
        System.out.println();

    }
}
