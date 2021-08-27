package DevDojo.Q_String;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String nome2= "  Felipe Silva Honorato";
        String numeros = "012345";

        //Informa o character que se encontra na posição informada
        System.out.println(nome.charAt(2));

        //Informa o tamanho da String nome
        System.out.println(nome.length());

        //Substitui todos os caracteres da String nome por outro character
        System.out.println(nome.replace("f", "L"));

        //Deixa tudo com letras minúsculas
        System.out.println(nome.toLowerCase());

        //Deixa tudo com letras maiúsculas
        System.out.println(nome.toUpperCase());

        //Informa os valores através de - 1 dado índex inicial e 2 dado ponto final -1
        System.out.println(numeros.substring(0,6));
        System.out.println(numeros.substring(3, numeros.length()));
        System.out.println(numeros.substring(3));

        //Remove os espaços contidos no início ou final da String
        System.out.println(nome2.trim());


    }
}
