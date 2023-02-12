/*

Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), 
e depois mostrar as áreas destas figuras na mesma ordem em que foram digitadas.


Enter the number of shapes: 2
Shape #1 data:
Rectangle or Circle (r/c)? r
Color (BLACK/BLUE/RED): BLACK
Width: 4.0
Height: 5.0
Shape #2 data:
Rectangle or Circle (r/c)? c
Color (BLACK/BLUE/RED): RED
Radius: 3.0
SHAPE AREAS:
20.00
28.27

*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enuns.Color;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Shape> list = new ArrayList<>();


        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            System.out.println("Shape #"+i+" data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(ch == 'r')
            {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(color, width, height));
            }
            else if(ch == 'c')
            {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }

        System.out.println();

        System.out.println("SHAPE AREAS:");

        for(Shape shape: list)
        {
            System.out.println(String.format("%.2f", shape.area()));
        }


        sc.close();
    }
}
