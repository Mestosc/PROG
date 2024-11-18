/**
 * Mostrar una lista de numeros aleatorios desde el ultimo al primero
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[6]; // Estableciendo lista de numeros
        for (int j = 0;j<numeros.length;j++) {
            numeros[j] = (int)Math.floor(Math.random()*50)+1; // Añadiendo numeros aleatorios entre el 1 y el 50 ambos incluidos a cada espacio del array, lo que hace es cojer numeros entre 0 y 49 y le suma 1 de esa manera elejira entre 1 y 50
        }
        for (int i = numeros.length-1;i>0;i--){ /* Hacer un bucle for
        para iterar de forma inversa los numeros del array para obtener las posiciones al reves
        */
            System.out.println(numeros[i]); //Mostrar cada uno de los numeros de la lista
        }
    }
}
