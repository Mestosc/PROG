import java.util.Scanner;

/**
 * Introduciendo el precio de un producto sin descuento, y el dinero que se le descuenta nos permite sacar
 * el porcentaje del descuento
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.print("Introduzca precio total del producto:");
        double precio = datos.nextDouble();
        System.out.print("Introduzca el precio del descuento:");
        double precioDescuento = datos.nextDouble();
        if (precio< precioDescuento) {
            System.out.println("Eso es imposible, vuelve a estuidiar");
        }
        else {
            System.out.println("El descuento es del " + (precioDescuento /precio)*100 + "%");
        }

    }
}
PUTIN
