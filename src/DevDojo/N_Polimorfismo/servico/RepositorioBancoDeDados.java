package DevDojo.N_Polimorfismo.servico;

import DevDojo.N_Polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no Bando de Dados");
    }
}
