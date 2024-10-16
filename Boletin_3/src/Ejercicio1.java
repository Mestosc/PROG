import java.util.Scanner;
/**
 * Este codigo nos solicitara un numero por teclado si el valor es positivo lo imprimira por pantalla
 * y dira que es positivo sino no lo hara
 * @author oscar
**/
public class Ejercicio1 {
    public static void main(String[] args) {
        int valTeclado;
        Scanner introduccionValor = new Scanner(System.in);
        System.out.print("Introduzca un valor numerico:");
        valTeclado = introduccionValor.nextInt();
        introduccionValor.close();
        if (valTeclado > 0) {
            System.out.println(valTeclado);
            System.out.println("Es positivo");
        }
    }
}
