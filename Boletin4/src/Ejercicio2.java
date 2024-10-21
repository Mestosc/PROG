import java.util.Scanner;
/**
 * Nos permite calcular el area de tres figuras geometricas especificas, que son Cuadrado, Triangulo
 * y obtener su area
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio2 {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radio;
        int base;
        int altura;
        int lado;
        Scanner cosas = new Scanner(System.in);
        System.out.println("1. Cuadrado\n2. Triangulo\n3. Circulo\n\nIntroduzca el numero que corresponda a la figura de la que quiera calcular el area ");
        int opcion = cosas.nextInt();
        switch (opcion) {
            case 1-> {
                System.out.print("Digame cuanto mide un lado:");
                lado = cosas.nextInt();
                System.out.print("El area de este cuadrado es de " + lado*lado);
            }
            case 2-> {
                System.out.print("Digame de cuanto es la base:");
                base = cosas.nextInt();
                System.out.print("Digame de cuanto es la altura:");
                altura = cosas.nextInt();
                System.out.println("El area de este triangulo es de " + (base*altura/2));
            }
            case 3-> {
                System.out.print("Digame de cuanto es el radio:");
                radio = cosas.nextDouble();
                System.out.println("El area del circulo es de " + (PI*(radio*radio)));
            }
        }
    }
}
