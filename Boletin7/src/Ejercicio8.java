/**
 * A traves de una lista de numeros obtener pares;
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {23,12,54,67,8,9,10,16,20,100};
        for (int numero : numerosPares(numeros)) {
            System.out.println(numero);
        }
    }

    /**
     * Obtener los numeros pares de un array y obtenerlos en una lista
     * @param lista el array de numeros del que queremos obtener los pares
     * @return devuelve la lista de numeros pares
     */
    static int[] numerosPares(int[] lista) {
        int numPares=0;
        for (int numero : lista) {
            if (numero % 2 == 0) numPares++;
        }
        int[] pares = new int[numPares]; // Crea una lista a partir de cuantos pares hay en la lista
        for (int i = 0, indicePares = 0;i<lista.length;i++) {
            if (lista[i] % 2 == 0) {
                pares[indicePares] = lista[i]; // Igualar un valor de pares al valor par de lista correspondiente
                indicePares++; // Incrementar el valor j cada vez que haya un par para que revise la lista si el numero es par lo añade a los pares y aumenta el indice de pares
            }
        }
        return pares;
    }
}
