package DevDojo.O_Excessoes.runtime.teste;

import DevDojo.O_Excessoes.exceptions.teste.dominio.Funcionario;
import DevDojo.O_Excessoes.exceptions.teste.dominio.LoginInvalidoException;
import DevDojo.O_Excessoes.exceptions.teste.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {


    Pessoa pessoa = new Pessoa();
    Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
