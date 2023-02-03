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


        /*
        for(String s : ZoneId.getAvailableZoneIds())
        {
            System.out.println(s);
        }
        */


        // convertendo data global em localdate com base no timezone do computador
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        // convertendo data global em localdate com base no timezone de portugal
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));


        System.out.println("r1 = "+r1);
        System.out.println("r2 = "+r2);
        System.out.println("r3 = "+r3);
        System.out.println("r4 = "+r4);


        System.out.println("d04 dia = "+d04.getDayOfMonth());
        System.out.println("d04 mes = "+d04.getMonthValue());
        System.out.println("d04 ano = "+d04.getYear());

        System.out.println("d05 hora = "+d05.getHour());
        System.out.println("d05 minuto = "+d05.getMinute());

    }
}


