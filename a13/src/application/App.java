package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        /*
        nao aceita tipos primitivos, apenas wraped class (Ex. List <Integer>)
        
        <> - serve para parametrizar o tipo
        
        ArrayList() - nao dá para instanciar uma lista, é necessário usar uma classe,
        a mais famosa é a ArrayList() q tbm add funcionalidades q deixam a lista 
        com um funcionamento semelhante aos vetores
        */
        List<String> list = new ArrayList<>();

        list.add("magno");
        list.add("caput");
        list.add("mag");
        list.add("cap");
        list.add("teste");
        list.add("testando");
        // add no indice 2
        list.add(2, "michel");

        System.out.println(list.size());

        list.remove("caput");
        // indice
        list.remove(2);



        for (String x : list) {
            System.out.println(x);
        }

        // predicado - se houver um elemento x em que o caracter inicial seja 't', será removido
        list.removeIf(x -> x.charAt(0) == 't');

        System.out.println("--------------");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------");

        // retorna o indice do elemento (retorna -1 quando n há o elemento)
        System.out.println(list.indexOf("cap"));


        // CRIANDO UMA LISTA APENAS COM ELEMENTO QUE COMEÇEM COM UMA LETRA ESPECIFICADA

        /*
        stream() - serve para usar expressões lambda (predicados)
        filter() - escrever o predicado
        collect(Collectors.toList()) - necessário para dar um resultado no formato lista, pois o stream e filter n sao compatíveis
        */
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'm').collect(Collectors.toList());

        System.out.println("--------------");
        for (String x : result) {
            System.out.println(x);
        }


        //PROCURANDO O PRIMEIRO ELEMENTO CUJO NOME COMEÇA COM A LETRA ESPECIFICADA
        
        System.out.println("--------------");

        /*
        findFirst() - especifica de retornar apenas o  primeiro elemento da expressão
        orElse() - se nao encontrar nada retorna algo (no exemplo, um valor nulo)
        */
        String name = list.stream().filter(x -> x.charAt(0) == 'h').findFirst().orElse(null);
        System.out.println(name);

    }
}
