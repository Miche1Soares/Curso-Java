/*

Fazer um programa para ler uma quantia e a duração em meses de um empréstimo. 
Informar o valor a ser pago depois de decorrido o prazo do empréstimo, conforme regras de juros do Brasil. 
A regra de cálculo de juros do Brasil é juro composto padrão de 2% ao mês.

Amount: 200.00
Months: 3
Payment after 3 months:
212.24

A regra de cálculo de juros dos EUA é juro composto padrão de 1% ao mês.

Amount: 200.00
Months: 3
Payment after 3 months:
206.06

*/

package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);


        System.out.println("Payment after " + months + " months: ");
        System.out.println(String.format("%.2f", payment));


        sc.close();

    }
}
