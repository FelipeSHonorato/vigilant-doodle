package DevDojo.N_Polimorfismo.teste;

import DevDojo.N_Polimorfismo.dominio.Computador;
import DevDojo.N_Polimorfismo.dominio.Produto;
import DevDojo.N_Polimorfismo.dominio.Televisao;
import DevDojo.N_Polimorfismo.dominio.Tomate;
import DevDojo.N_Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {


        Produto computador = new Computador("CoreI7", 12000);
        Produto tomate = new Tomate("Siciliano", 32, "12/04/2022");
        Produto televisao = new Televisao( "Samsung 50\" ", 7000);
        Produto computador2 = new Computador("Razen 9", 5000);

        Tomate tomate1 = new Tomate("Americano", 20, "12/05/2022");


        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(tomate1);





    }

}
