package DevDojo.N_Polimorfismo.servico;

import DevDojo.N_Polimorfismo.dominio.Produto;
import DevDojo.N_Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do tomate");
        double imposto = produto.calcularImposto();
        System.out.println("Nome Produto: " + produto.getNome());
        System.out.println("Valor " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        if(produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
