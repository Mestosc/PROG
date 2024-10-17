import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String letra;
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduzca su numero de DNI:");
        int DNI = numero.nextInt();
        int valorLetra = DNI % 22;
        letra = switch (valorLetra) {
           case 0->  "T";
           case 1->  "R";
           case 2->  "W";
           case 3->  "A";
           case 4->
           default -> "";
        };
    }
}
