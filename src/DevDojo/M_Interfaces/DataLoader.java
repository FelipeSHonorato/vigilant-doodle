package DevDojo.M_Interfaces;

public interface DataLoader  {
    int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaDatasize na interface");
    }

}
