package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> temperaturas = RegistroClima.obtenerArchivo();
        Scanner sc = new Scanner(System.in);
        int opt;
        do {
            System.out.println("1.Novo rexistro\n2.Listar rexistros\n3.Mostrar estadistica");
            System.out.print("Digame que accion va realizar: ");
            opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1 -> {
                    System.out.println("Introduzca la temperatura");
                    double d = sc.nextDouble();
                    sc.nextLine();
                    temperaturas.add(d);
                }
                case 2 -> {
                   for (Double temperatura : temperaturas) {
                       System.out.println(temperatura);
                   }
                }
                case 3 ->
                {
                    System.out.println();
                }
            }
        } while (opt!=4);
        RegistroClima.crearFichero(temperaturas);
    }
    static Double obtenerPromedio(ArrayList<Double> temp) {
        double suma = 0;
        for (Double t : temp) {
            suma += t;
        }
        return suma/temp.size();
    }
    static Double obtenerMinimo(ArrayList<Double> temp) {
        return 0.0;
    }
}
