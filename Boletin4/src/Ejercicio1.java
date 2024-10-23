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

        // Preparamos el Scanner para recojer informacion
        Scanner informacion = new Scanner(System.in);

        // Indicar que se quiere solicitar el nombre del producto
        System.out.print("Digame el nombre del producto:");

        // Solicitamos la informacion del nombre del prodcuto
        nombreProducto = informacion.next();

        // Solicitamos informacion del numero de ventas del producto
        System.out.print("Digame cuantas ventas ha tenido el producto:");

        // Solicitamos la informacion del numero de ventas
        numeroVentas = informacion.nextInt();

        // Comprobamos si las ventas son menores a 100, e imprimimos que es de consumo bajo
        if (numeroVentas<=100) {
            System.out.println("El producto " + nombreProducto + " ha tenido " + numeroVentas + " ventas" + " es un articulo de consumo bajo");
        }

        /* Como es un else if sabemos que la anterior no se cumple asi que solo necesitamos
        * saber si es menor o igual a 500, imprimimos que es de Consumo medio */
        else if (numeroVentas<=500) {
            System.out.println("El producto " + nombreProducto + " ha tenido " + numeroVentas + " ventas" + " es un articulo de consumo medio");
        }

        /* Como es un else if ya sabemos que la segunda no se ha cumplido asi que solo necesitamos
         * saber si es menor o igual a 1000, y imprimimos el mensaje de que el producto es de Consumo Alto */
        else if (numeroVentas<=1000) {
            System.out.println("El producto " + nombreProducto + " ha tenido " + numeroVentas + " ventas" + " es un articulo de consumo alto");
        }

        // Aqui solo necesitamos saber que es mayor que 1000 que en este caso es por descarte, e imprimimos el mensaje de que es de Primera necesidad
        else {
            System.out.println("El producto " + nombreProducto + " ha tenido " + numeroVentas + " ventas" + " es un articulo de primera necesidad");
        }

    }
}