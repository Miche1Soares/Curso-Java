/*

Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo

Enter department's name: Design
Enter Worker data:
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00 
How many contracts to this worker? 3
Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2018
Value per hour: 50.00
Duration (hours): 20
Enter contract #2 data:
Date (DD/MM/YYYY): 13/06/2018
Value per hour: 30.00
Duration (hours): 18 
Enter contract #3 data:
Date (DD/MM/YYYY): 25/08/2018
Value per hour: 80.00
Duration (hours): 10
Enter month and year to calculate income (MM/YYYY): 08/2018
Name: Alex
Department: Design
Income for 08/2018: 3000.00

https://snipboard.io/SYk9w5.jpg

*/
package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter Worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine(); 
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        
        // WorkerLevel.valueOf(workerLevel) - pega o valor lido e associa com os enums existentes dentro da classe
        // new Department(departmentName) - instância visto q o departamento aponta para uma classe
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));


        System.out.print("How many contracts to this worker?  ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            System.out.println("Enter contract #"+i+" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();


            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }
        System.out.println("");

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        //  recorta só o pedaço do indice 0 e 1, que representa o mes, e dps transforma em Integer
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        // recorta só o pedaço do indice 3 em diante, que representa o ano, e dps transforma em Integer
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: "+ worker.getName());

        System.out.println("Department: "+worker.getDepartment().getName());

        // formata em 2 casas decimais e chama o metodo income para retornar seu valor
        System.out.println("Income for "+ monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        sc.close();

    }
}
