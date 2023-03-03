import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7); 
        
        Stream<Integer> st1 = list.stream(); 
        
        //                 converte a strem para array
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); 
        
        System.out.println(Arrays.toString(st2.toArray()));
        
        //                                  parte do 0 e faz a função de adição a cada elemento
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        
        //                                  limit - determina um limite para a execução do iterate
        System.out.println(Arrays.toString(st3.limit(10).toArray()));




        List<Integer> list2 = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st4 = list.stream().map(x -> x * 10);
        
        System.out.println(Arrays.toString(st4.toArray()));
        
        //                              parte do 0 e faz a função de soma a cada elemento
        int sum = list2.stream().reduce(0, (x, y) -> x + y); 
        
        System.out.println("Sum = " + sum);
        
        List<Integer> newList = list.stream()
            .filter(x -> x % 2 == 0)
            .map(x -> x * 10)
            .collect (Collectors.toList()); System.out.println(Arrays.toString(newList.toArray()));
    }
}
