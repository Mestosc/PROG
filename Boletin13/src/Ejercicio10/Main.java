package Ejercicio10;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> mapRef = Fichero.obtenerFichero("mapaExistencias.dat");
        Scanner sc = new Scanner(System.in);
    }
    static void menu() {
        System.out.print("Indique accion a realizar: ");
    }
}
