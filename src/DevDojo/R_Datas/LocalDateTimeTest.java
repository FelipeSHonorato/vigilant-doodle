package DevDojo.R_Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {

        //Criando uma variável para LocalDateTime agora
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Essa Classe possui todas as funcionalidades de LocalDate e LocalTime!!!
        System.out.println(localDateTime.getDayOfMonth());

        //Criando duas varíaveis date e time em String e transformando em data e hora
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("08:55:30");
        System.out.println(date);
        System.out.println(time);

        //Juntando as variáveis data e time
        LocalDateTime ltd1 = date.atTime(time);
        LocalDateTime ltd2 = time.atDate(date);
        System.out.println(ltd1);
        System.out.println(ltd2);










    }
}
