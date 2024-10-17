import java.util.Scanner;
/**
 * Aqui se implementa la funcionalidad para obtener el valor absoluto de un numero
 * entiendase valor absoluto es cuanto hay de ese numero al cero sin importar su signo
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner introduccionD = new Scanner(System.in);

        // Solcitamos que se introduzca un valor numerico
        System.out.print("Introduzca un valor numerico:");
        // Solicitamos un valor cualquiera
        int numero = introduccionD.nextInt();

        // Asignamos el valor a una variable con el condicional ternario
        int valorAbsoluto = (numero<=-1) ? -numero:numero;
        System.out.println("El valor absoluto del numero " + numero + " es " + valorAbsoluto);
    }
}
