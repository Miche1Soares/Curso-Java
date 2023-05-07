public class App {
    public static void main(String[] args) throws Exception {

        /*
        
        Formatar: toLowerCase(), toUpperCase(), trim()
        Recortar: substring(inicio), substring(inicio, fim)
        Substituir: Replace(char, char), Replace(string, string)
        Buscar: IndexOf, LastIndexOf
        str.Split(" ")

        */

        String origi = "abcde FGHI jklm OPQRS    ";

        System.out.println("Origi: -" + origi + "-");

        // trim() - elimina os espaços nas extremidades da string
        System.out.println("Trim: -" + origi.trim() + "-");

        // substring(2) - printa apenas o conteudo a partir do caractere de index 2
        System.out.println("Substring(2): -" + origi.substring(2) + "-");

        // substring(2,8) - printa apenas o conteudo a partir do caractere de index 2 até o caractere de index 8
        System.out.println("Substring(2): -" + origi.substring(2,8) + "-");

        // replace('a','x') - substitui todos os 'a' por 'x'
        System.out.println("Replace: -" + origi.replace('a', 'x') + "-");
        System.out.println("Replace: -" + origi.replace("a", "XYZ") + "-");

        // indexOf("bc") - printa o index da primeira ocorrencia do trecho buscado
        System.out.println("IndexOf: -" + origi.indexOf("cd") + "-");

        // LastindexOf("GH") - printa o index da ultima ocorrencia do trecho buscado
        System.out.println("LastIndexOf: -" + origi.lastIndexOf("GH") + "-");


        // dividira a string nos espaços e colocara os elementos em um vetor 
        String[] separado = origi.split(" ");

        System.out.println(separado[0]);
        System.out.println(separado[1]);
        System.out.println(separado[2]);
        System.out.println(separado[3]);

    }
}
