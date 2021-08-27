package DevDojo.Q_String;

public class StringTestePerformance {
    public static void main(String[] args) {

        //Podemos analisar que o sistema fica cada ve mais lento pela quantidade de String geradas na pool
        long inicio = System.currentTimeMillis();
        concalString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com o ciclo: " + (fim - inicio) + " ms");

        //Analisando o mesmo método porém agora com StringBuilder
        long inicio2 = System.currentTimeMillis();
        concatStringBuilder(30_000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto com o ciclo com StringBuilder: " + (fim2 - inicio2) + " ms");

        //Analisando o mesmo método porém agora com StringBuffer
        long inicio3 = System.currentTimeMillis();
        concatStringBuilder(30_000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo gasto com o ciclo com StringBuffer: " + (fim2 - inicio2) + " ms");
    }

    //Criamos um método para gerar uma quantidade específicas de Strings na pool
    private static void concalString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    //Criamos um método para gerar uma quantidade específicas de Strings na pool agora com StringBuilder
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sbr = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbr.append(i);

        }
    }
}
