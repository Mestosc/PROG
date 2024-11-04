import java.util.Scanner;

/**
 * Nos dice el factorial de un numero
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int numero = dato.nextInt();
        long factorial=1; //Declaramos la variable como long para si da un numero cuyo factorial sea muy largo
        for (int i=1;i<numero;i++) {
            factorial *=i; // Los numeros enteros anteriores a numero que son i se van multiplicando
        }
        System.out.printf("El factorial de %d es: %,d\n", numero, (numero*factorial));
    }
}
