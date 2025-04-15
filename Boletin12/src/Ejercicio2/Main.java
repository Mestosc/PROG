package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notas notas = new Notas();
        Scanner sc = new Scanner(System.in);
        menu(sc,notas);
    }
    static void menu(Scanner sc, Notas notas) {
        int opcion;
        do {
            System.out.println("Introduzca la operativa a realizar:\n1.Insertar nota\n2.Listar notas\n3.Buscar por palabra clave\n4.Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1-> {
                    var notaEscribir = sc.nextLine();
                    notas.escribirNota(notaEscribir);
                }
                case 2-> {
                    System.out.println(notas.obtenerNotas());
                }
                case 3-> {
                    System.out.println("Introduzca palabra clave");
                    var keyword = sc.next();
                    System.out.println(notas.obtenerNotas(keyword));
                }
            }
        } while (opcion!=4);
    }
}
