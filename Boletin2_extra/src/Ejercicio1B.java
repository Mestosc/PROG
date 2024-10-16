import java.util.Scanner;
/**
 * Este codigo nos pedira el precio con el descuento y sin el descuento, y a partir de eso calcula el porcentaje
 * de descuento
 * @author oscar
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
            System.out.println("El descuento es del " + ((precio-precioDescontado)/precio) * 100 + "%");
        }
    }
}


