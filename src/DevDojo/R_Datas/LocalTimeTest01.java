package DevDojo.R_Datas;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        //Criando uma variável de referência para hora estipulada
        LocalTime time = LocalTime.of(23,32,12);
        System.out.println(time);
        //Imprindo informaçòes especificas da variável time
        System.out.println(time.getHour());
        System.out.println(time.getMinute());



        //Criando uma variável com a hora de agora
        LocalTime horaAgora = LocalTime.now();
        System.out.println(horaAgora);
        //Imprindo informaçòes especificas da variável horaAgora
        System.out.println(horaAgora.getHour());
        System.out.println(horaAgora.getMinute());

        //Informa a hora máxima e mínima do dia
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);




    }
}
