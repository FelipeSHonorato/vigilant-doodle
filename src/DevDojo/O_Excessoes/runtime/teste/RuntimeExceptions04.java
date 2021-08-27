package DevDojo.O_Excessoes.runtime.teste;

public class RuntimeExceptions04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException i) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException a) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException r) { //Excessão mais genérica como Runtime deve vir por último
            System.out.println("Dentro do RuntimeException");
        }

        //Ou pode ser feito do jeito abaixo:

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException a) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException i) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException r) { //Excessão mais genérica como Runtime deve vir por último
            System.out.println("Dentro do RuntimeException");
        }
    }
}
