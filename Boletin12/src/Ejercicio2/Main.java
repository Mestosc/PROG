package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notas notas = new Notas();
        Scanner sc = new Scanner(System.in);

    }
    static void menu(Scanner sc, Notas notas) {
        int opcion;
        do {
            System.out.println("Introduzca la operativa a realizar:\n1.Insertar nota\n2.Listar notas\n3.Buscar por palabra clave");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1-> {
                    var notaEscribir = sc.nextLine();
                    notas.escribirNota(notaEscribir);
                }
                case 2-> {
                    notas.obtenerNotas();
                }
            }
        } while (opcion!=4);
    }
}
