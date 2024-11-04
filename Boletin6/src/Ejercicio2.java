import java.util.Scanner;
/**
 * Nos solicita un numero y nos permite imprimir Eco... varias veces con una funcion
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero");
        Scanner introduccion = new Scanner(System.in);
        eco(introduccion.nextInt()); // Llamando al metodo eco
        introduccion.close();
    }

    /**
     * Nos muestra la palabra Eco... una cantidad n de veces
     * @param veces la cantidad de veces que muestra Eco...
     */
    static void eco(int veces) {
        for (int i = 0;i<veces;i++) {
            System.out.println("Ecoo...");
        }
    }
}
