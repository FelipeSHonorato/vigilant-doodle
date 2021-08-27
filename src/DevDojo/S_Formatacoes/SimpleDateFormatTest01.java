package DevDojo.S_Formatacoes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        //Primeiro criamos uma máscara (pattern) para criar um formato que desejamos imprimir
        String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy";

        //Criamos um novo object do tipo SimpleDateFormat e inserimos a máscara que desejamos utilizar;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        //Imprimimos utilizando o objeto que criamos .format para formatar e dentro new Date para puxarmos a data atual
        System.out.println(sdf.format(new Date()));


    }
}
