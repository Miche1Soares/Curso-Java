import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        //fuso horário de londres
        Instant d03 = Instant.now();

        //inserindo dados (conforme a ISO) e os transformando em datas
        LocalDate d04 = LocalDate.parse("2023-01-05");
        LocalDateTime d05 = LocalDateTime.parse("2023-01-05T12:34:23");

        Instant d06 = Instant.parse("2023-01-05T12:34:23Z");

        //o -3 indica q esta sendo inserido um fuso horario local, será retornado dps o horario ajustado ao fuso de londres
        Instant d07 = Instant.parse("2023-01-05T12:34:23-03:00");


        //cria uma formatação para usar datas de formato personalizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //                                                  insere agora a formatação
        LocalDate d08 = LocalDate.parse("05/01/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("05/01/2023 12:34", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));



        // inserindo dia, mes, ano etc individualmente e transformando em data
        LocalDate d10 = LocalDate.of(2023, 1, 5);
        LocalDateTime d11 = LocalDateTime.of(2023, 1, 5, 1, 30);

        


        System.out.println("d01 = "+d01);
        System.out.println("d02 = "+d02);
        System.out.println("d03 = "+d03);
        System.out.println("d04 = "+d04);
        System.out.println("d05 = "+d05);
        System.out.println("d06 = "+d06);
        System.out.println("d07 = "+d07);
        System.out.println("d08 = "+d08);
        System.out.println("d09 = "+d09);
        System.out.println("d10 = "+d10);
        System.out.println("d11 = "+d11);

    }
}
