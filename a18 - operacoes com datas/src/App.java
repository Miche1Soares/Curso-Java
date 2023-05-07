import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate d04 = LocalDate.parse("2023-01-05");

        LocalDateTime d05 = LocalDateTime.parse("2023-01-05T12:34:23");

        Instant d06 = Instant.parse("2023-01-05T12:34:23Z");


        LocalDate minusWeek = d04.minusDays(7);
        LocalDate plusWeek = d04.plusDays(7);


        LocalDateTime minusWeekTime = d05.minusDays(7);
        LocalDateTime plusWeekTime = d05.plusDays(7);


        // acrescentando dias nos instants
        Instant minusWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant plusWeekInstant = d06.plus(7, ChronoUnit.DAYS);


        // duraçao entre duas datas
        // OBS: o duration nao aceita localdate, ou seja é necessário transformar em localdatetime acrescentando horas e minutos ao localdate
        // atStartOfDay() - transforma em localdatetime e add como 0h e 0min
        // atTime() - transforma em localdatetime e add manualmente 0h e 0min
        Duration t1 = Duration.between(minusWeek.atStartOfDay(), d04.atTime(0,0));
        Duration t2 = Duration.between(minusWeekTime, d05);
        Duration t3 = Duration.between(minusWeekInstant, d06);
        Duration t4 = Duration.between(d06, minusWeekInstant);


        System.out.println("minusWeek = "+minusWeek);
        System.out.println("plusWeek = "+plusWeek);
        

        System.out.println("minusWeekTime = "+minusWeekTime);
        System.out.println("plusWeekTime = "+plusWeekTime);


        System.out.println("minusWeekInstant = "+minusWeekInstant);
        System.out.println("plusWeekInstant = "+plusWeekInstant);


        // toDays() - especifica em qual unidade de medida será exibida a diferença
        System.out.println("t1 dias = "+t1.toDays());
        System.out.println("t2 dias = "+t2.toDays());
        System.out.println("t3 dias = "+t3.toDays());
        System.out.println("t4 dias = "+t4.toDays());
    }
}


