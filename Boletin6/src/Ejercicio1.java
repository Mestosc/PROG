import java.util.Scanner;
/** Nos solicita dos numeros y luego realiza operaciones usando el metodo numerosEntre
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner introduccionDato = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int numero1 = introduccionDato.nextInt(); // Solicitar numero
        System.out.println("Introduzca otro numero:");
        int numero2 = introduccionDato.nextInt(); // Solicitar numero
        numerosEntre(numero1,numero2); // Llamando al metodo numerosEntre

    }

    /**
     * Nos solicita dos numeros y nos dice cuantos hay entre ellos
     * @param num1 es el primer valor solicitado
     * @param num2 es el segundo valor solicitado
     */
    static void numerosEntre(int num1, int num2) {
        if (num1>num2) {
            int aux = num1; // Declaramos que numero 1 es igual a aux
            num1 = num2; // Numero 1 es igual a numero 2
            num2 = aux; // Numero 2 es igual a auxiliar asi cambiamos el orden de numero y no hay que repetir el bucle
        }
        for (int i = num1+1; i<num2;i++) {
            System.out.println(i);
        }
    }
}
