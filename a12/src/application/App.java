package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* 
        EXEMPLO criando vetor

        int n = sc.nextInt();
        
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i=0; i<n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        */












        /*

        EXEMPLO for each
        
        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        
        for (int i=0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }

        for (String obj : vect) {
            System.out.println(obj);
        }

        */











        


        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for(int i=0; i<vect.length; i++)
        {
            sc.nextLine();

            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);
        }


        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE: %.2f%n", avg);

        sc.close();
    }
}