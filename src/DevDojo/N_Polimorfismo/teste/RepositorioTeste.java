package DevDojo.N_Polimorfismo.teste;

import DevDojo.N_Polimorfismo.repositorio.Repositorio;
import DevDojo.N_Polimorfismo.servico.RepositorioArquivo;


public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
