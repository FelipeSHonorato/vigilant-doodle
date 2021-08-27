package DevDojo.R_Datas;

import java.time.*;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime localTime = LocalTime.now();
        LocalTime timeMinus7Hours = localTime.now().minusHours(2);

        //Através da Duration podemos ver a duração em horas de um certo período de tempo.
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        System.out.println(d1);

        Duration d2 = Duration.between(localTime,timeMinus7Hours);
        System.out.println(d2);

        Duration d3 = Duration.between(Instant.now(),Instant.now().plusSeconds(1000));
        System.out.println(d3);

        //Mostra a duração de 20 dias em horas
        Duration d4 = Duration.ofDays(20);







    }
}
