package DevDojo.R_Datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        //Vimos que através do plus podemos somar anos, meses, dias.
        now = now.plusDays(20);
        System.out.println(now);

        //Através do with podemos setar um dia, mes, ano.
        now= now.withDayOfMonth(5);
        System.out.println(now);
        System.out.println(now= now.withYear(2022));

        //Através do with podemos inserir o ChronoField para substituir data especifica
        now = now.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(now);

        //Com with e TemporalAdjusters podemos procurar relações futuras em datas, como a próxima domingo...
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //Com with e TemporalAdjusters podemos procurar relações futuras em datas pulando o dia atual.
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //Com with e TemporalAdjusters podemos procurar relações passada em datas, como a domingo anterior...
        now = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //Com with e TemporalAdjusters podemos procurar relações passada em datas,pulando o dia atual.
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        //Achando o primeiro dia do mês

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //Achando o último dia do mês
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


    }
}
