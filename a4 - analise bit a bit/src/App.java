public class App {
    public static void main(String[] args) throws Exception {

        /*
        
        & - AND bit a bit
        | - OR bit a bit
        ^ - OR EXCLUSIVO bit a bit

        89 - 0101 1001
        60 - 0011 1100

        fazendo a analise bit a bit da direita para esquerda temos como resultado:

        & - 0001 1000 (24 em dec.)
        | - 0111 1101 (125 em dec.)
        ^ - 0110 0101 (101 em dec.)

        */

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

    }
}
