import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        double radio;
        int base;
        int altura;
        int lado;
        Scanner cosas = new Scanner(System.in);
        System.out.println("1. Cuadrado\n2. Triangulo\n3. Circulo");
        int opcion = cosas.nextInt();
        switch (opcion) {
            case 1-> {
                System.out.print("Digame cuanto mide un lado");
                lado = cosas.nextInt();
                System.out.println("El area de este cuadrado es de" + lado*lado);
            }
            case 2-> {
                System.out.print("Digame de cuanto es la base:");
                base = cosas.nextInt();
                System.out.print("Digame de cuant");
            }
        }
    }
}
