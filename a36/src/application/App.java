package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        // hashset - rápido (na execuçaõ) mas não garante a ordem da lista
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        // estas ações podem ser executadas nos outros sets
        set.remove("Tablet");
        set.removeIf(x -> x.charAt(0) == 'N');

        System.out.println(set.contains("Notebook"));

        for(String p : set)
        {
            System.out.println(p);
        }
        System.out.println();


        // treeset - lento (na execuçaõ) mas ordena os dados
        TreeSet<String> set2 = new TreeSet<>();

        set2.add("TV");
        set2.add("Notebook");
        set2.add("Tablet");

        System.out.println(set2.contains("Notebook"));

        for(String p : set2)
        {
            System.out.println(p);
        }
        System.out.println();


        // linkedhashset - mantém a ordem da inserção dos elementos
        LinkedHashSet<String> set3 = new LinkedHashSet<>();

        set3.add("TV");
        set3.add("Notebook");
        set3.add("Tablet");

        System.out.println(set3.contains("Notebook"));

        for(String p : set3)
        {
            System.out.println(p);
        }
        System.out.println();


        // Conjuntos


        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));


        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);


        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);


        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}
