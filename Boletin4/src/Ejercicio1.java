import java.util.Scanner;

/**
 * Este programa nos mostrara si un articulo es de primera necesidad a partir del nombre
 * y del numero de ventas
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio1 {
    public static void main(String[] args) {
        // Primero inicializamos las variables donde se guardara la informacion
        int numeroVentas;
        String nombreProducto;
        Scanner informacion = new Scanner(System.in);
        System.out.print("Digame el nombre del producto:");
        nombreProducto = informacion.next();
        System.out.print("Digame cuantas ventas ha tenido el producto:");
        numeroVentas = informacion.nextInt();
        if (numeroVentas<=100) {
            System.out.println("El producto " + nombreProducto + " ha tenido " + numeroVentas + " ventas" + " es un articulo de consumo bajo");
        }
        else if (100>numeroVentas && numeroVentas<=500) {
            System.out.println("El producto " + nombreProducto + " ha tenido " + numeroVentas + " ventas" + " es un articulo de consumo medio");
        }
        else if (numeroVentas>500 & numeroVentas<=1000) {
            System.out.println("El producto " + nombreProducto + " ha tenido " + numeroVentas + " ventas" + " es un articulo de consumo alto");
        }

    }
}