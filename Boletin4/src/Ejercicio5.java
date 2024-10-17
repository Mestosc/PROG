import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String letra;
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduzca su numero de DNI:");
        int DNI = numero.nextInt();
        int valorLetra = DNI % 23;
        letra = switch (valorLetra) {
           case 0-> "T";
           case 1-> "R";
           case 2-> "W";
           case 3-> "A";
           case 4-> "G";
           case 5-> "M";
           case 6-> "Y";
           case 7-> "F";
           default -> "";
        };
        System.out.println("La letra para el siguiente " + DNI + " es " + letra);
    }
}
