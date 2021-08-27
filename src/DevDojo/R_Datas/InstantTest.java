package DevDojo.R_Datas;

import java.time.Instant;

public class InstantTest {
    public static void main(String[] args) {

        //Criamos o objeto now, seus valores seguem padrão UCT Greewich - Tempo neutro mundial
        Instant now = Instant.now();
        System.out.println(now);

        //Informa os segundos
        System.out.println(now.getEpochSecond());
        //Informa nano segundos -> valor máximo de um nano segundo é 999.999.999
        System.out.println(now.getNano());

        //Informa a data e hora em Zulu time UCT
        System.out.println(Instant.ofEpochSecond(1629469858));

        //Acrescentando 1 segundo através do ajuste de nanosegundos
        System.out.println(Instant.ofEpochSecond(1629469858, 1_000_000_000));





    }
}
