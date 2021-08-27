package DevDojo.R_Datas;

import java.util.Date;

public class Date_Class {
    public static void main(String[] args) {

        // Date trabalha com long em milissegundos
        Date date = new Date(1000);

        //Informa a data referente a quantidade de milissegundos que vc inseriu
        System.out.println(date);

        //Informa os milissegundos inseridos no objeto Date
        System.out.println(date.getTime());

        // Caso deixe em valor ele retorna a quantidade de ms do dia atual
        Date date2 = new Date();

        System.out.println(date2);

        System.out.println(date2.getTime());

    }
}
