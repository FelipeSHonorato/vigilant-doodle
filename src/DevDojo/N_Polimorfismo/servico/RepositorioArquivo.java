package DevDojo.N_Polimorfismo.servico;

import DevDojo.N_Polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no Arquivo");
    }
}
