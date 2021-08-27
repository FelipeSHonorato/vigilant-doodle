package DevDojo.Q_String;

public class StringTest01 {
    public static void main(String[] args) {

        //Strings são IMUTÁVEIS

        String nome = "Felipe";
        String nome2 = "Felipe";

        // Criada uma nova constante no pool de String
        nome = nome.concat(" Honorato");


        Integer number1 = 1;
        Integer number2 = 1;

        System.out.println(nome);

//        System.out.println(nome3);

        System.out.println(nome == nome2); // Usado para ver se a REFERÊNCIA é direcionada para o mesmo objeto

        System.out.println(nome.equals(nome2)); // Usado para ver se os objetos são os mesmos

        System.out.println(number1 == number2);

        System.out.println(number1.equals(number2));

        //Criamos um object que encapsulou o nome William que está na pool

        String nome3 = new String("Felipe");

        //Efetuamos com o código acima 3 ações - 1 criamos uma referencia do tipo String, 2 criamos um objeto tipo String e 3 criamos uma variável no pool String


        //Assim quando perguntamos se o nome2 (nome literal da pool) é igual ao nome3 (objeto) ele da false

        System.out.println(nome2 == nome3);

        //Porem se fizermos a mesma pergunta porem agora com .intern() do nome3,onde ele abstrai o valor dentro de nome3 o resultado é true
        System.out.println(nome2 == nome3.intern());


    }
}
