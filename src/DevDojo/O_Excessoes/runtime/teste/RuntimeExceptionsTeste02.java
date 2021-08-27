package DevDojo.O_Excessoes.runtime.teste;

public class RuntimeExceptionsTeste02 {

    public static void main(String[] args) {

    divisao(1,0);

    }

    private static int divisao(int a, int b){
        if (b==0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        try{
            return a/b;
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        return 0;
    }
}
