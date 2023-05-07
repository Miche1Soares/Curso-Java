package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class App {
    public static void main(String[] args) throws Exception {

        /*

        Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
        A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, becé a seguinte (fórmula de Heron): a+b+c

        area = √p(p − a)(p − b)(p − c)

        onde p = (a + b + c)/2

        */

        Locale.setDefault(Locale.US);
        Scanner sc;

        sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();


        System.out.println("Lados do triangulo X:");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Lados do triangulo Y:");

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();

        double areaY = y.area();


        System.out.printf("Area triangulo X = %.2f%n", areaX);
        System.out.printf("Area triangulo Y = %.2f%n", areaY);

        if(areaX > areaY){
            System.out.println("Maior area = X");
        }else{
            System.out.println("Maior area = Y");
        }

        sc.close();

    }
}
