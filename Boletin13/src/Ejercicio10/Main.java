package Ejercicio10;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> mapRef = Fichero.obtenerFichero("mapaExistencias.dat");
        //menu(mapRef);
    }
    static void darAlta(Map<String,Integer> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame el codigo de producto:");
        var cod = sc.next();
        System.out.println("Digame la cantidad de producto:");
        var cant = sc.nextInt();
        map.put(cod,cant);
    }
    static void darBaixa(Map<String,Integer> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame el codigo de producto:");
        var cod = sc.next();
        map.remove(cod);
    }
    static void menu(Map<String,Integer> map) {
        Scanner sc = new Scanner(System.in);
        int opt;
        do {
            System.out.println("1.Dar de alta producto\n2.Dar de baixa producto\n3.Actualizar producto\n4.Visualizar productos\n5.Salir");
            System.out.print("Indique accion a realizar: ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                   darAlta(map);
                   break;
                case 2:
                    darBaixa(map);
                    break;

            }
        } while (opt != 5);
        Fichero.guardarFichero("productos.dat",map);
        sc.close();
    }
}
