package DevDojo.S_Formatacoes;

import java.text.DateFormat;
import java.util.Calendar;

public class Date_Format {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTime());

        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getInstance(); //--> 18/08/21 14:18
        df[1] = DateFormat.getDateInstance(); //--> 18/08/2021
        df[2] = DateFormat.getDateTimeInstance(); //--> 18/08/2021 14:18:30
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); //--> 18/08/21
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); //--> 18/08/2021
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); //--> 18 de Agosto de 2021
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); //--> Quarta-feira, 18 de Agosto de 2021

        //dataCorre (variável criada para percorrer a array, .format (método para formatar saída de um Date) dentro
        //calendar variável para informar as informações de hoje e .getTime para formatar o dado.
        for (DateFormat dataCorre :  df ) {
            System.out.println(dataCorre.format(calendar.getTime()));
        }

    }
}
