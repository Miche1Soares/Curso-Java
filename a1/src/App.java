//possibilita a configuração da localidade
import java.util.Locale;

//import javax.tools.DocumentationTool.Location;


public class App {
    public static void main(String[] args) throws Exception {

        //troca a localidade para os US, assim por padrão, usará '.' ao invés de ',' nos valores decimais
        Locale.setDefault(Locale.US);

        double x = 10.1234;

        System.out.println("Hello, World!");
        /* 
        
        %n - quebra de linha
        %f - double ou float
        %d - inteiro
        %s - texto

        */
        System.out.printf("%.3f%n", x); 

        System.out.printf("Valor de X = %f unidades%n", x);

        System.out.printf("Valor de X = %.2f unidades%n%n", x);


        int a, b;
        double res;

        a = 5;
        b = 2;

        // (double) - converte o resultado para double
        res = (double) a / b;

        System.out.println(res);

        double c;
        int d;

        c = 5;

        // (int) - converte o valor para int
        d = (int) c;

        System.out.println(d);
        
    }
}
