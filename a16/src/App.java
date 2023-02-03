import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate d04 = LocalDate.parse("2023-01-05");

        LocalDateTime d05 = LocalDateTime.parse("2023-01-05T12:34:23");

        Instant d06 = Instant.parse("2023-01-05T12:34:23Z");


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // ajusta datas descritas no fuso horário padrão para o do local do computador
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        //
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;





        System.out.println("d04 = "+d04.format(fmt1));
        // ou
        System.out.println("d04 = "+fmt1.format(d04));
        // ou
        System.out.println("d04 = "+d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        

        System.out.println("d05 = "+d05.format(fmt2));

        System.out.println("d05 = "+d05.format(fmt4));

        // quando for tipo Instant é necessário formatar pelo 'fmt3'
        System.out.println("d06 = "+fmt3.format(d06));

    }
}

