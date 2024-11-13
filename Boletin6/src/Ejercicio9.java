/**
 * Calcular numero de la serie Fibonnacci mediante un metodo
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 1;
        System.out.println(numero1);
        fibonacci(numero1,numero2,10);
    }

    /**
     * Mostrar los numeros desde el segundo elemento en adelante
     * @param numero1 El primer elemento de Fibonacci
     * @param numero2 El segundo elemento de Fibonacci
     * @param elementos la cantidad de numeros a mostrar
     */
    static void fibonacci(int numero1,int numero2,int elementos) {
        if (elementos!=0) {
            int suma = numero1 + numero2;
            System.out.println(suma);
            fibonacci(numero2,suma,elementos-1);
        }
        else {
            System.out.print("");
        }
    }

}
