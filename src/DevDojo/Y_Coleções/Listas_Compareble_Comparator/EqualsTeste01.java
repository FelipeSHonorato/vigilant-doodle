package DevDojo.Y_Coleções.Listas_Compareble_Comparator;

import DevDojo.Y_Coleções.Equals_HashCode.domínio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");

        //Retorna false porque ele compara se s1 e s2 está fazendo referencia ao mesmo objeto,porem pode ser modificado através do Override de equals

        System.out.println(s1.equals(s2));

        Smartphone s3 = new Smartphone("1ABC1", "Iphone");
        Smartphone s4 = s3;

        System.out.println(s3.equals(s4)); //Retorna true porque o s3 e s4 está fazendo referência ao mesmo objeto
    }
}
