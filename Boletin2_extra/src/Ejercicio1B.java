import java.util.Scanner;
/**
 * Este codigo nos pedira el precio con el descuento y sin el descuento, y a partir de eso calcula el porcentaje
 * de descuento
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio1B {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.print("Introduzca precio total sin descuento:");
        double precio = datos.nextDouble();
        System.out.print("Introduzca el precio con el descuento aplicado:");
        double precioDescontado = datos.nextDouble();
        if (precio < precioDescontado) {
            System.out.println("Eso es imposible, vuelve a estuidiar");
        }
        else {
            System.out.printf("El porcentaje descontado es: %.2f%%\n", ((precio-precioDescontado)/precio) * 100);
        }
    }
}


