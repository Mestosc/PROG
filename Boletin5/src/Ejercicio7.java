import java.util.Scanner;
/** Permite hacer un triangulo cuya altura sea igual al numero escrito en teclado usando asteriscos
 * @author Oscar
 * @version 1.0
 * **/
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int numero = pedir.nextInt();
        for (int i=1;i<=numero;i++) { // Este bucle for verifica si la variable de control es menor o igual al numero
            for (int x = numero - i;x>0;x--) { /* Este bucle imprime espacios en cada iteración, calculando (numero-i) para determinar cuántos espacios se imprimen en una linea.
            La variable de control decrementa en cada ciclo para reducir los espacios impresos progresivamente.*/
                System.out.print(" ");
            }
           for (int k = 1; k <= i; k++) { /* Este bucle comprueba si esta variable de control es igual o menor a la del bucle principal
           haciendo una iteracion para imprimir tantos asteriscos como la variable de control del primer bucle
           */
                System.out.print("* "); // Imprime un asterisco seguido de un espacio
            }
            System.out.println(); // Imprime un salto de linea despues de que se imprimen los espacios y asteriscos
        }
    }
}
