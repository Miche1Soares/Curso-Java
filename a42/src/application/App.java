package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product ("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Headset", 80.0));

        // stream - sequencia de dados
        // map - aplica uma função a cada elemento de um stream
        // .collect(Collectors.toList()) -  transforma a stream em lista novamente
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        names.forEach(System.out::println);
        System.out.println();





        List<Product> list2 = new ArrayList<>();

        list2.add(new Product("TV", 900.0));
        list2.add(new Product ("Notebook", 1200.0));
        list2.add(new Product("Tablet", 400.0));
        list2.add(new Product("Mouse", 50.0));
        list2.add(new Product("Headset", 80.0));

        // stream - sequencia de dados
        // map - aplica uma função a cada elemento de um stream
        // .collect(Collectors.toList()) -  transforma a stream em lista novamente
        List<String> names2 = list2.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        names2.forEach(System.out::println);
        System.out.println();





        List<Product> list3 = new ArrayList<>();

        list3.add(new Product("TV", 900.0));
        list3.add(new Product ("Notebook", 1200.0));
        list3.add(new Product("Tablet", 400.0));
        list3.add(new Product("Mouse", 50.0));
        list3.add(new Product("Headset", 80.0));

        // stream - sequencia de dados
        // map - aplica uma função a cada elemento de um stream
        // .collect(Collectors.toList()) -  transforma a stream em lista novamente
        List<String> names3 = list3.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        names3.forEach(System.out::println);
        System.out.println();





        List<Product> list4 = new ArrayList<>();

        list4.add(new Product("TV", 900.0));
        list4.add(new Product ("Notebook", 1200.0));
        list4.add(new Product("Tablet", 400.0));
        list4.add(new Product("Mouse", 50.0));
        list4.add(new Product("Headset", 80.0));


        Function<Product, String> func = p -> p.getName().toUpperCase();

        // stream - sequencia de dados
        // map - aplica uma função a cada elemento de um stream
        // .collect(Collectors.toList()) -  transforma a stream em lista novamente
        List<String> names4 = list4.stream().map(func).collect(Collectors.toList());

        names4.forEach(System.out::println);
        System.out.println();





        List<Product> list5 = new ArrayList<>();

        list5.add(new Product("TV", 900.0));
        list5.add(new Product ("Notebook", 1200.0));
        list5.add(new Product("Tablet", 400.0));
        list5.add(new Product("Mouse", 50.0));
        list5.add(new Product("Headset", 80.0));

        // stream - sequencia de dados
        // map - aplica uma função a cada elemento de um stream
        // .collect(Collectors.toList()) -  transforma a stream em lista novamente
        List<String> names5 = list5.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names5.forEach(System.out::println);
        System.out.println();

    }
}
