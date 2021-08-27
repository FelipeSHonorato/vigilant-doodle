package DevDojo.R_Datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {

        //Impressão de data atual
        System.out.println(new Date());

        //Impressão de data atual
        System.out.println(Calendar.getInstance());

        //Impressão do mês em forma de numeral
        System.out.println(Month.AUGUST.getValue());

        //Criando uma variável de uma data específica utilizando LocalDate -> A partir do Java 1.8
        //A classe LocalDate é IMUTÁVEL,ela não pode sofrer alteração de adição como por exemplo adicionar dias ou semanas
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 20);

        //Imprimi a data especificada em formato para BDs
        System.out.println(date);

        //Imprimindo o ano da variável date
        System.out.println(date.getYear());

        //Imprimindo o dia do ano da variável date
        System.out.println(date.getDayOfMonth());

        //Imprimindo o tamanho do mês da variável date
        System.out.println(date.lengthOfMonth());

        //Imprimindo se o mês da variável date é bi-sexto
        System.out.println(date.isLeapYear());

        //Imprimindo também o mês da variável date em forma de numeral
        System.out.println(date.get(ChronoField.MONTH_OF_YEAR));

        //Criando uma variável com a data de agora, formato utilizado para BDs
        LocalDate dataAgora = LocalDate.now();
        System.out.println(dataAgora);

        //Informação da data máxima e mínima de utilização
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        //Para poder fazer adiçào ou subtração de datas é necessário associar a uma variável de referência
        date = date.plusDays(3);
        System.out.println(date);







    }
}
