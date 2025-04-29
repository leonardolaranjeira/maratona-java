package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

import org.w3c.dom.ls.LSOutput;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retriveMaxDataSixe() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
