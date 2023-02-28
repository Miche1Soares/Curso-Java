package application;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product ("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        // ordena os elementos pelo nome
        list.sort(new MyComparator());




        // outra forma usando uma classe anonima, criada e especificada dentro do programa principal
        List<Product> list2 = new ArrayList<>();

        list2.add(new Product("TV", 900.0));
        list2.add(new Product ("Notebook", 1200.0));
        list2.add(new Product("Tablet", 400.0));


        Comparator<Product> comp = new Comparator<Product>() 
        {
            @Override
            public int compare(Product p1, Product p2) 
            {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }   
        };

        list2.sort(comp);






        // outra forma usando expressão lambda
        List<Product> list3 = new ArrayList<>();

        list3.add(new Product("TV", 900.0));
        list3.add(new Product ("Notebook", 1200.0));
        list3.add(new Product("Tablet", 400.0));

        /*
        Comparator<Product> comp2 = (p1, p2) -> {

            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        };
        */

        // como é realizada apenas uma linha de ação, n é necessário usar {}
        //Comparator<Product> comp2 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        //list3.sort(comp2);

        //forma ultra resumida
        list3.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));







        
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

    }
}
