package DevDojo.U_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {

        String regex = "";
        String texto = "ababbababaaabbabbabababaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:    " + texto);
        System.out.println("índice:  012356789");



    }
}
