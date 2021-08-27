package DevDojo.O_Excessoes.exceptions.teste.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws  LoginInvalidoException, FileNotFoundException {
        System.out.println("salvando funcionario");
    }
}
