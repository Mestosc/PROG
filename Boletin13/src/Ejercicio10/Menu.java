package Ejercicio10;

import java.util.Map;
import java.util.Scanner;

public class Menu {
    static String archivo = "mapaProductos.dat";
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
    static void actualizar(Map<String,Integer> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame el codigo de producto:");
        var cod = sc.next();
        System.out.println("Digame cuantos obtuvo por cierto la perdida debe expresarla precedida con un -:");
        var new_value = sc.nextInt();
        new_value = map.get(cod)+new_value;
        if (Math.max(new_value,0)==0) map.remove(cod);
        else map.put(cod,new_value);
    }
    public static void menu(Map<String,Integer> map) {
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
                case 3:
                    actualizar(map);
                    break;
                case 4:
                    map.forEach((codigoProducto,cantidad) -> System.out.println("Codigo de producto: " + codigoProducto + "\n\tCantidad: " + cantidad)); /* Este metodo empieza al parecer por el más reciente, poniendolo primero esto tiene pinta de que es
                     más util si quieres iterar una estructura como una lista o así y aplicar una funcion o así sobre los elementos que contiene el objeto o sobre el propio objeto o al menos esa es la impresion que me da aunque bueno, al no haber un criterio de como se tiene que mostrar pues me da igual
                     También se puede usar entrySet para obtener todas las claves y recorrerlas con un for Each de los tipicos además la implementacion base de esto que creo que proviene de Iterable
                       se comporta por defecto haciendo eso internamente*/
                    break;
            }
        } while (opt != 5);
        Fichero.guardarFichero(archivo,map);
    }
}
