import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // \\ pois um \ só é para parametros na frase
        File file = new File("/home/michel/Documentos/Programas/Java/Udemy/Aulas/a28/txt/text.txt");

        Scanner sc = null;

        try
        {
            sc = new Scanner(file);
            // testa se há alguma linha a ser lida no documento
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            if(sc != null)
            {
                sc.close();
            }
        }


        // ====================== OUTRA FORMA ======================

        String path = "/home/michel/Documentos/Programas/Java/Udemy/Aulas/a28/txt/text2.txt";
        BufferedReader br = null;
        FileReader fr = null;

        try
        {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while(line != null)
            {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            try
            {
                if(br != null)
                {
                    br.close();
                }
                if(fr != null)
                {
                    fr.close();
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }


        // ====================== OUTRA FORMA (MELHOR) ======================

        String path2 = "/home/michel/Documentos/Programas/Java/Udemy/Aulas/a28/txt/text3.txt";

        try(BufferedReader br2 = new BufferedReader(new FileReader(path2)))
        {
            String line = br2.readLine();

            while(line != null)
            {
                System.out.println(line);
                line = br2.readLine();
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }


        // ====================== ESCREVENDO ======================

        String path3 = "/home/michel/Documentos/Programas/Java/Udemy/Aulas/a28/txt/createdText.txt";

        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good night"};

        // retirando o true, ao invés da inserção ser reescrita no documento, o arquivo será criado novamente e aparecerá apenas a inserção da compilação atual
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path3, true)))
        {
            for(String line : lines)
            {
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


        // ====================== CRIANDO PASTAS ======================


        // /home/michel/Documentos/Programas/Java/Udemy/Aulas/a28/txt

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc2.nextLine();

        File path4 = new File(strPath);

        // listar os diretorios existentes no caminho especificado
        File[] folders = path4.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for(File folder : folders)
        {
            System.out.println(folder);
        }

        // listar os arquivos existentes no caminho especificado
        File[] files = path4.listFiles(File::isFile);
        System.out.println("Files: ");
        for(File file2 : files)
        {
            System.out.println(file2);
        }


        boolean success = new File(strPath + "/newDirectory").mkdir();
        System.out.println("Directory created: " + success);

        sc2.close();

    }
}
