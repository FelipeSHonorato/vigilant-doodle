package DevDojo.R_Datas;

import java.util.Calendar;
import java.util.Date;

public class Calendar_Class {
    public static void main(String[] args) {

        //Por ser uma classe abstrata não se pode criar um objeto com ela é necessário utilizar o método getInstance para pegar a instância
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //Utilizando o Date para formatar a data
        Date date = c.getTime();
        System.out.println(date);

        //Faz uma comparação se o inteiro retornado por .getFirstDayOfWeek é o mesmo que .SUNDAY
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }

        //Retorna um inteiro referente ao dia atual da semana -> Seg (2), Ter (3), Qua(4), Qui(5), Sex(6), Sab(7), Dom(1).
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        //Retorna um inteiro referente ao dia atual do mês -> De 1 a 30 ou 31.
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        //Retorna um inteiro referente ao dia atual do ano -> De 1 a 356.
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        //Retorna um inteiro referente ao dia atual da semana no mês -> De
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        //Pega o dia ATUAL DO MÊS e soma com valor inserido
        c.add(Calendar.DAY_OF_MONTH, 2);

        //Soma o valor inserido com as horas atuais, caso seja mais de 24 horas pode influenciar na data final modificando o dia, mês e ano caso necessário.
        c.add(Calendar.HOUR, 2);

        //Soma o valor inserido com as horas atuais sem modificar a data/mês/ano caso fosse acontecer com o add
        c.roll(Calendar.HOUR, 2);



    }
}
