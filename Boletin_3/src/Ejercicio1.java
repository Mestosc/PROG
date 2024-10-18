import java.util.Scanner;
/**
 * Este codigo nos solicitara un numero por teclado si el valor es positivo lo imprimira por pantalla
 * y dira que es positivo sino no lo hara
 * @author oscar
 * @version 1.0
**/
public class Ejercicio1 {
    public static void main(String[] args) {
        int valTeclado;
        Scanner introduccionValor = new Scanner(System.in);
        System.out.print("Introduzca un valor numerico:");
        valTeclado = introduccionValor.nextInt();
        introduccionValor.close();

        // Comprobamos si el valor es mayor que 0 si asi es lo mostrara y dira que es positivo
        if (valTeclado > 0) {
            System.out.println(valTeclado);
            System.out.println("Es positivo");
        }
    }
}
