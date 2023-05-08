package application;
import java.util.Scanner;

import services.PrintService;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

		// o parametro passado aqui será implementado na classe PrintService
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();

    }
}
