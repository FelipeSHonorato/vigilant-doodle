package DevDojo.M_Interfaces.test;

import DevDojo.M_Interfaces.DataBaseLoader;
import DevDojo.M_Interfaces.DataLoader;
import DevDojo.M_Interfaces.FileLoader;

public class DataLoaderTest {

    public static void main(String[] args) {


        DataBaseLoader databaseloader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseloader.load();
        fileLoader.load();

        databaseloader.remove();
        fileLoader.remove();

        databaseloader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}

