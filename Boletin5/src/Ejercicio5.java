import java.util.Scanner;
/**
 * Permite ingresar los sueldos de varios trabajadores (cada sueldo es un trabajador)
 * y calcula el porcentaje de trabajadores que ganan entre 1,000 y 1,750 y los que ganan menos de 1,000.
 * Se utiliza un valor de 0 como señal de terminación para dejar de ingresar sueldos.
 * El programa excluye sueldos negativos y muestra un mensaje de error si no se ha introducido un sueldo valido que haga que haya al menos un trabajador.
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        double sueldo;

        // Declaramos las variables de cantidad de trabajadores incializandolas 0 por conveniencia
        int cantTrabajadoresMas1000 = 0, cantTrabajadoresMenos1000 = 0, trabajdoresTotal = 0;

        // Iniciamos Scanner
        Scanner recibir = new Scanner(System.in);
        System.out.print("Introduzca sueldo (se sale con 0):");
        sueldo = recibir.nextDouble();
        while (sueldo != 0) { // Inicia un bucle que se ejecuta mientras 'sueldo' no sea igual a 0.
            if (sueldo > 0) { // Verifica que el 'sueldo' sea positivo.
                if (sueldo >= 1000 && sueldo <= 1750) { // Comprueba si el sueldo está entre 1000 y 1750.
                    cantTrabajadoresMas1000++; // Incrementa el contador de trabajadores que ganan entre 1000 y 1750.
                } else if (sueldo < 1000) { // Si el sueldo es positivo pero menor a 1000:
                    cantTrabajadoresMenos1000++; // Incrementa el contador de trabajadores que ganan menos de 1000.
                }
                trabajdoresTotal++; //Incrmenta el valor total de trabajadores
            }
            sueldo = recibir.nextDouble(); // Solicita el siguiente sueldo.
        }
            if (trabajdoresTotal > 0) {
                System.out.printf("El porcentaje de trabajadores que cobran entre 1.000 y 1.750 es: %.2f%%\n", ((double) cantTrabajadoresMas1000 / (double) trabajdoresTotal) * 100);
                System.out.printf("El porcentaje de trabajadores que cobran entre que cobran menos de 1.000 es: %.2f%%\n", (cantTrabajadoresMenos1000 / (double) trabajdoresTotal) * 100);
            } else {
                System.out.println("No se han introducido trabajadores es imposible hacer un calculo");
            }
        }
    }
