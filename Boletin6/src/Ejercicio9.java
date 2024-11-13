/**
 * Calcular numero de la serie Fibonnacci mediante un metodo
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        fibonacci(0,1,10);
    }

    /**
     * Muestra de dos numeros la serie de fibonacci con el numero de elementos
     * seleccionados
     * @param numero1 el primer numero de la serie de Fibonacci a mostrar
     * @param numero2 el segundo numero de la serie de Fibonacci a mostrar
     * @param elementos el numero de elementos a mostrar
     */
    static void fibonacci(int numero1,int numero2,int elementos) {
        if (elementos!=0) { // Mientras los elementos sean distintos de 0 hacemos el proceso
            int suma = numero1 + numero2; // Hacemos la suma
            System.out.println(suma); // Imprimimos la suma
            fibonacci(numero2,suma,elementos-1); /* Luego hacemos una llamada recursiva colocando el segundo
            numero en el lugar del primero y le restamos los elementos*/
        }
        else {
            System.out.print(""); // En caso de que no se cumpla la condicion devuelve un print que imprime un String vacio practicamente
        }
}}
