import java.util.Scanner;

public class Numerosprimos {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numero = datos.nextInt();
        for (int num = 2; num<=numero;num++) {
            boolean esPrimo = numero % num != 0;

        }
    }
}
