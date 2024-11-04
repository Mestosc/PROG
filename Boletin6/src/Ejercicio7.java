import java.util.Scanner;

/**
 * Calculo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int numero,resultado; // Definimos algunas variables utiles
        Scanner scanner = new Scanner(System.in); // Creamos objeto de la clase Scanner para la recojida de datos
        System.out.println("Indicamos introducir el numero:");// Indicamos los datos que queremos recojer
        numero = scanner.nextInt();
        resultado = calculoFactorial(numero);
        System.out.println("El factorial de " + numero + " es " + resultado);
    }

    /**
     * Calculamos el factorial de un numero mediante un metodo recursivo
     * @param numero El numero del que queremos saber el factorial
     * @return Multiplicacion de (numero*(numero-1))
     */
    static int calculoFactorial(int numero) {
        if (numero==0) { // Definimos el caso base, el factorial de 0 es 1
            return 1; //Entonces devolvemos valor 1
        }
        return numero * calculoFactorial(numero-1); /* Devolvemos el numero multiplicado por si mismo -1 luego cuando llegue a 0
         se devolvera 1 y se multiplicara al acumulado*/
    }
}
