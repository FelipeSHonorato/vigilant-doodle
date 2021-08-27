package DevDojo.S_Formatacoes;

import java.util.Locale;

public class Locale_Class2 {
    public static void main(String[] args) {

        //Informa como está a localização do seu computador
        System.out.println(Locale.getDefault());

        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");

        }
        System.out.println();

        for (String isoCountrie : isoCountries) {
            System.out.print(isoCountrie + " ");


        }
    }
}
