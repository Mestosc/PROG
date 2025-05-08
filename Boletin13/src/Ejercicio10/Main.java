package Ejercicio10;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> mapRef = Fichero.obtenerFichero("mapaProductos.dat");
        Menu.menu(mapRef);
    }

}
