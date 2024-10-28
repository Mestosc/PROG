import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int numero = dato.nextInt();
        long factorial=1; //Declaramos la variable como long para si da un numero cuyo factorial sea muy largo
        for (int i=1;i<numero;i++) {
            factorial *=i;
        }
        System.out.printf("El factorial de %d es: %,d\n", numero, (numero*factorial));
    }
}
