package DevDojo.Q_String;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "William Suane";
        nome.concat(" Suane");
        System.out.println(nome);

        // Por padrão StringBuilder/StringBuffer tem como capacidade 16 characters, sendo que ele dobra automaticamente conforme uso
        StringBuilder sb1 = new StringBuilder(16);
        StringBuilder sb2 = new StringBuilder();

        // Para adicionar um valor a StringBuilder é necessário utilizar o método .append().
        sb1.append("Felipe");

        System.out.println(sb1);

        //Através do append adicionamos tb mais informações
        sb1.append(" Silva").append(" Honorato"); //--> Felipe Silva Honorato

        System.out.println(sb1);

        //Inverte a sequencia de caracteres
        sb1.reverse();
        System.out.println(sb1);

        //Deleta uma sequência de caracteres
        sb1.delete(0,6);
        System.out.println(sb1);
    }
}
