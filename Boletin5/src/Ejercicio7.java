import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        String caract ="";
        int numero = pedir.nextInt();
        for (int i=1;i<=numero;i++) {
            for (int x = numero - i;x>0;x--) {
                System.out.print(" ");
            }
           for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Imprime un asterisco seguido de un espacio
            }
            System.out.println();
        }
    }
}
