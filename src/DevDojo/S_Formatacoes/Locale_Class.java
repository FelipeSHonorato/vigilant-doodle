package DevDojo.S_Formatacoes;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Locale_Class {
    public static void main(String[] args) {

        //É criada referência para localizações de países para formatações de datas
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale ("hi", "IN");
        Locale localeIJapao = new Locale ("ja", "JP");
        Locale localeIHolanda = new Locale ("nl", "NL");

        //Criado uma referência para solicitar a data atual
        Calendar calendar = Calendar.getInstance();

        //Criada uma referência DateFormat para criar a formatação dos países
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeIHolanda);

        //Chamada com as referência de formatação com argumento calendar onde irá inserir a data atual
        System.out.println("Italia " + df1.format(calendar.getTime()));
        System.out.println("Suiça " + df2.format(calendar.getTime()));
        System.out.println("India " + df3.format(calendar.getTime()));
        System.out.println("Japão " + df4.format(calendar.getTime()));
        System.out.println("Holanda " + df5.format(calendar.getTime()));

        //Mostra como nome do país conforme a configuração do seu computador
        System.out.println(localeIJapao.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeIHolanda.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeIndia.getDisplayCountry());

    }
}
