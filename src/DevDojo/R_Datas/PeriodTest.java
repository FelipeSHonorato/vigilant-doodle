package DevDojo.R_Datas;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {

        //Inserimos datas para utilizar com Period
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

        //Através de Period vemos uma diferente entre períodos -> Retorna em Anos, dias e meses
        Period p1 = Period.between(now, nowAfterTwoYears);
        //Através de Period vemos uma diferente entre períodos -> Retorna em DIAS
        Period p2 = Period.ofDays(10);
        //Através de Period vemos uma diferente entre períodos -> Retorna em DIAS
        Period p3 = Period.ofWeeks(56);
        //Através de Period vemos uma diferente entre períodos -> Retorna em Meses
        Period p4 = Period.ofMonths(42);
        //Através de Period vemos uma diferente entre períodos -> Retorna em Anos
        Period p5 = Period.ofYears(4);



        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}
