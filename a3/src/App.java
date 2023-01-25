import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        // realizar entrada de dados
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;
        int a;

        a = sc.nextInt();
        
        //evita erro ao pressionar enter na inserção anterior
        sc.nextLine();

        // nextLine() - Lê uma frase
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println(a);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // encerra o processo de entrada de dados
        sc.close();

    }
}
