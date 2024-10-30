import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner introduccionDato = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int numero1 = introduccionDato.nextInt();
        System.out.println("Introduzca otro numero:");
        int numero2 = introduccionDato.nextInt();
        funcionNumerosEntre(numero1,numero2);

    }
    static void funcionNumerosEntre(int num1, int num2) {
        for (int i = num1+1; i>=num1 && i<=num2;i++) {
            System.out.println(i);
        }
    }
}
