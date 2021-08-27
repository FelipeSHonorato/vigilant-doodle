package DevDojo.A_Arrays;

public class Array02 {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        nomes[0] = "João";
        nomes[1] = "Clara";
        nomes[2] = "Felipe";

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("*********************************");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println("*********************************");

        int[] idades = new int[]{15, 25, 30};

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        System.out.println("*********************************");

        for (int idade : idades) {
            System.out.println(idade);
        }


    }
}
