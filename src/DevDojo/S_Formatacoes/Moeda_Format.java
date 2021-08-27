package DevDojo.S_Formatacoes;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Moeda_Format {
    public static void main(String[] args) {

        //Cria uma referência para localização local
        Locale localeDefault = Locale.getDefault();

        //Cria uma referência para localização português, Brasil
        Locale localePT = new Locale("pt", "br");

        //Cria uma referência para localização japonês, Japão
        Locale localeJP = Locale.JAPAN;

        //Cria uma referência para localização italiano, Itália
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[5];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localePT);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[4] = NumberFormat.getInstance();

        double valor = 1_000;

        for (NumberFormat numFormat : nfa) {
            // MaximumFractionDigits informa quantas casas decimais são permitidas para tal linguagem
            System.out.println(numFormat.getMaximumFractionDigits());

            System.out.println(numFormat.format(valor));

            // Forçando duas casas decimais
            numFormat.setMaximumFractionDigits(2);
            System.out.println(numFormat.getMaximumFractionDigits());

            System.out.println(numFormat.format(valor));
        }

        //Transformando um valor String para valor numérico através do parse - NFA[4]
        String valorString = "1000.2130";
        try {
            System.out.println(nfa[4].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Transformando um valor String para valor numérico através do parse - NFA[1]
        String valorString2 = "￥1,000";
        try {
            System.out.println(nfa[1].parse(valorString2));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Double valorDouble = Double.parseDouble(valorString);

        System.out.println(valorString);

        Locale[] locales = new Locale[2];

        locales[0]= localePT;
        locales[1]=localeJP;

        //Transformando um número variável em monetário através de regras de uma array
        System.out.println(NumberFormat.getCurrencyInstance(locales[1]).format(valorDouble));
        System.out.println(NumberFormat.getCurrencyInstance(localePT).format(valorDouble));

    }
}
