import java.util.Scanner;

public class Numerosprimos {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numero = datos.nextInt();
        for (int num = 1; num<=numero;num++) {
            boolean esPrimo = num % 2 != 0;
            if (esPrimo) {
                System.out.println(num);
            }
        }
    }
}
