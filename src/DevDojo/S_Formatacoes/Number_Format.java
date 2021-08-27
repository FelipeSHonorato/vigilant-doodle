package DevDojo.S_Formatacoes;

import java.text.NumberFormat;
import java.util.Locale;

public class Number_Format {
    public static void main(String[] args) {

        //Cria uma referência para localização local
        Locale localeDefault = Locale.getDefault();

        //Cria uma referência para localização português, Brasil
        Locale localePT = new Locale("pt", "br");

        //Cria uma referência para localização japonês, Japão
        Locale localeJP = Locale.JAPAN;

        //Cria uma referência para localização italiano, Itália
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localePT);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.213;

        for (NumberFormat numFormat : nfa) {
            System.out.println(numFormat.getMaximumFractionDigits());
            System.out.println(numFormat.format(valor));
        }

    }
}
