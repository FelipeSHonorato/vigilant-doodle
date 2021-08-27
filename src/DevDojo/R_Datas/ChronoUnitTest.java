package DevDojo.R_Datas;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {

        LocalDateTime aniversario = LocalDateTime.of(1984, Month.FEBRUARY, 29, 10,0,0);
        LocalDateTime now = LocalDateTime.now();

        // Através do ChronoUnit podemos fazer uma comparação entre datas com dados estipulados
        System.out.println(ChronoUnit.DAYS.between(aniversario, now) + " dias");
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now) + " semanas");
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now) + " meses");
        System.out.println(ChronoUnit.YEARS.between(aniversario, now) + " anos");

    }
}
