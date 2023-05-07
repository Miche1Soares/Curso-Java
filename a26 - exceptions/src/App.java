import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);


        //tenta executar o código
        try
        {
            // separa uma frase pelos espaços em branco e armazena os elementos em um vetor
            String[] vetor = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vetor[position]);
        }
        // se houver erro, executa outro código
        // erro de inserção de um indice inexistente
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid position");

            // mostra as chamadas (as linhas e seus comandos) que acarretaram erro
            e.printStackTrace();
        }
        // erro de inserção de um caracter diferente de um numero
        catch(InputMismatchException e)
        {
            System.out.println("Input error");
        }
        // bloco que será executado independentemente se houve excessões ou não
        finally
        {
            System.out.println("Finally block");
        }

        System.out.println("End");


        sc.close();

    }
}
