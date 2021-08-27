package DevDojo.O_Excessoes.exceptions.teste;

import DevDojo.O_Excessoes.exceptions.teste.dominio.Leitor1;
import DevDojo.O_Excessoes.exceptions.teste.dominio.Leitor2;

import java.io.*;

public class TryWhithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo3();
    }

    public static void lerArquivo3() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        } catch (IOException e) {
        }
    }

    public static void lerArquivo() throws IOException {
        try (Reader reader = new BufferedReader(new FileReader("Teste.txt"))) {
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}

