package DevDojo.Y_Coleções.Listas_Compareble_Comparator;

import DevDojo.Y_Coleções.Equals_HashCode.domínio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("2JAMN", "Pixel");
        Smartphone s3 = new Smartphone("23AKA", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3); //index muda a posição

        for (Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }

        //Verificamos se esse novo objeto já existe através do contains (ele usa o equals)
        Smartphone s4 = new Smartphone("23AKA", "Samsung");

        System.out.println(smartphones.contains(s4)); // -> true

        System.out.println(smartphones.indexOf(s4));



    }
}
