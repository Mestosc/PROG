/**
 * Calcular numero de la serie Fibonnacci mediante un metodo
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println(mostrarFibonnaci(10));
    }

    /**
     * Funcion para devolver los numeros de Fibonnaci, en una posicion determinada
     * @param num1 la posicion en la serie Fibonnacci
     * @return Los numeros de la serie de Fibonnaci
     */
    static int mostrarFibonnaci(int num1) {
        if (num1==0) { // Si el numero es 0 en la serie de Fibonnaci es el 0
            return 0; // Devuelve 0
        }
        else if (num1==1){ // Si el numero es 1 en la serie de Fibonnaci es el 1
            return 1; // Devuelve 1
        }
        return mostrarFibonnaci(num1-1) + mostrarFibonnaci(num1-2); /* Sumamos el (numero1-1) + (numero1-2)
        cuando hasta que el numero sea algunos de los valores*/
    }
}
