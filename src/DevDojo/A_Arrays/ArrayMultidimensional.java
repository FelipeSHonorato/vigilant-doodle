package DevDojo.A_Arrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {

        int tamanho = 2;
        int parede = 3;

        int[][] metragem = new int[tamanho][tamanho];

        metragem[0][0] = parede;
        metragem[0][1] = parede + 1;
        metragem[1][0] = parede + 2;
        metragem[1][1] = parede + 3;

        for (int i = 0; i < metragem.length; i++) {
            for (int j = 0; j < metragem[0].length; j++) {
                System.out.println(metragem[i][j]);
            }

        }
        System.out.println("**********************************");
        for (int[] metro : metragem) {
            for (int num : metro) {
                System.out.println(num);
            }

        }

        int[][] numeros = new int[3][];

        numeros[0] = new int[2];
        numeros[1] = new int[]{1, 2, 3};
        numeros[2] = new int[5];

        for (int[] numero : numeros) {
            System.out.println("\n*******************");
            for (int num : numero) {
                System.out.print(num);
            }


        }

        //Outro método de inicializar um array multidimensional

        int[][] medidas = {{3, 3}, {3, 32, 20}, {3, 3}};


    }


}
