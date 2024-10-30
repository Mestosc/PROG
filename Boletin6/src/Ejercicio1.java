import java.util.Scanner;
/** Si le introducimos un numero nos indica cuantos numeros hay entre esos dos
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner introduccionDato = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int numero1 = introduccionDato.nextInt();
        System.out.println("Introduzca otro numero:");
        int numero2 = introduccionDato.nextInt();
        numerosEntre(numero1,numero2);

    }
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
