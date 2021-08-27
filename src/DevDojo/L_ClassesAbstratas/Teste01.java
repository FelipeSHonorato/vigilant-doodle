package DevDojo.L_ClassesAbstratas;

public class Teste01 {
    public static void main(String[] args) {
        //Funcionario funcionario1 = new Funcionario("Felipe", 2000);
        Gerente gerente = new Gerente("Felipe", 5000);
        //System.out.println(funcionario1);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Toia", 12000);
        System.out.println(desenvolvedor);
    }
}
