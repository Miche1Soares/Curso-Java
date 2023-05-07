/*

Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora. Funcionários terceirizado possuem ainda uma despesa adicional.
O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.

Enter the number of employees: 3
Employee #1 data: 
Outsourced (y/n)? n
Name: Alex
Hours: 50
Value per hour: 20.00
Employee #2 data:
Outsourced (y/n)? y
Name: Bob
Hours: 100
Value per hour: 15.00 
Additional charge: 200.00
Employee #3 data:
Outsourced (y/n)? n
Name: Maria
Hours: 60
Value per hour: 20.00
PAYMENTS:
Alex $1000.00 -
Bob $ 1720.00 -
Maria $1200.00

*/

package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            System.out.println("Employee #"+i+" data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if(ch == 'y')
            {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            }else{

                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);

            }

        }

        System.out.println();

        System.out.println("PAYMENTS: ");

        for(Employee emp : list)
        {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }


        sc.close();

    }
}
