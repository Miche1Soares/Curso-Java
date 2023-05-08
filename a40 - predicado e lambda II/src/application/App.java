package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product ("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Headset", 80.0));

        //list.removeIf(p -> p.getPrice() >= 100);
        
        //outro jeito com predicado implementado manualmente por meio da interface
        list.removeIf(new ProductPredicate());




        List<Product> list2 = new ArrayList<>();

        list2.add(new Product("TV", 900.0));
        list2.add(new Product ("Notebook", 1200.0));
        list2.add(new Product("Tablet", 400.0));
        list2.add(new Product("Mouse", 50.0));
        list2.add(new Product("Headset", 80.0));

        //outro jeito com metodo estatico ao invés de criar uma nova classe (ProductPredicate)
        list2.removeIf(Product::staticProductPredicate);





        List<Product> list3 = new ArrayList<>();

        list3.add(new Product("TV", 900.0));
        list3.add(new Product ("Notebook", 1200.0));
        list3.add(new Product("Tablet", 400.0));
        list3.add(new Product("Mouse", 50.0));
        list3.add(new Product("Headset", 80.0));

        //outro jeito com metodo não estatico ao invés de criar uma nova classe (ProductPredicate)
        list3.removeIf(Product::nonStaticProductPredicate);





        List<Product> list4 = new ArrayList<>();

        list4.add(new Product("TV", 900.0));
        list4.add(new Product ("Notebook", 1200.0));
        list4.add(new Product("Tablet", 400.0));
        list4.add(new Product("Mouse", 50.0));
        list4.add(new Product("Headset", 80.0));

        //outro jeito com expressão lambda declarada
        Predicate<Product> pred = p -> p.getPrice() >= 100.0;

        list4.removeIf(pred);


        for(Product p : list)
        {
            System.out.println(p);
        }

        System.out.println();

        for(Product p : list2)
        {
            System.out.println(p);
        }

        System.out.println();

        for(Product p : list3)
        {
            System.out.println(p);
        }

        System.out.println();

        for(Product p : list4)
        {
            System.out.println(p);
        }

    }
}
