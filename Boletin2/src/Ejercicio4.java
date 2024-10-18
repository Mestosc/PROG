// Importando librerias
import java.util.Scanner;
/**
 * Introduciendo dos numeros se realizan las siguientes operaciones:
 * suma, resta, multiplicacion y division
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio4 {
    public static void main(String[] args) {
        double primer, segundo;
        // Preparacion para el uso del objeto Scanner
        Scanner numero = new Scanner(System.in);
        //Indicamos por pantalla que queremos un tipo de dato
        System.out.print("Introduzca un primer numero:");
        // Solicitamos que se introduzca el valor y lo guardamos en una variable
        primer = numero.nextDouble();
        //Indicamos por pantalla que queremos otro tipo de dato
        System.out.print("Introduzca un segundo numero:");
        segundo = numero.nextDouble();
        //Cerramos flujo de datos del objeto numero
        numero.close();
        //Mostramos por pantalla
        System.out.println("El resultado de la suma es:" + (primer+segundo));
        System.out.println("El resultado de la resta es:" + (primer-segundo));
        System.out.println("El resultado de la multiplicacion es:" + (primer*segundo));
        // Cambiamos el valor a double para que cuando dividamos por decimales lo muestre correctamente
        double division = (primer /segundo);
        System.out.println("El resultado de la division es:" + division);
    }
}
