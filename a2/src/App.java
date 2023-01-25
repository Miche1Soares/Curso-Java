import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        // realizar entrada de dados
        Scanner sc = new Scanner(System.in);

        String x;

        //inserir texto
        x = sc.next();

        System.out.printf("Digitaste: " + x + "%n%n");



        int n;

        //inserir numbers
        n = sc.nextInt();

        System.out.println("Digitaste: " + n);



        double d;

        //inserir ponto flutuante
        d = sc.nextDouble();

        System.out.println("Digitaste: " + d);



        char c;

        //inserir caracter
        c = sc.next().charAt(0);

        System.out.println("Digitaste: " + c);





        // Inserindo dados em uma mesma linha no terminal
        String x2;
        int n2;

        x2 = sc.next();

        n2 = sc.nextInt();

        System.out.printf("Digitaste: " + x2 + "%n%n");
        System.out.println("Digitaste: " + n2);

        // encerra o processo de entrada de dados
        sc.close();

    }
}
