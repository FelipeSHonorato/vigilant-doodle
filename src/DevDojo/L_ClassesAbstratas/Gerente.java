package DevDojo.L_ClassesAbstratas;

public class Gerente extends  Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public void calculaBonus() {
        salario = salario + salario * 0.1;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
