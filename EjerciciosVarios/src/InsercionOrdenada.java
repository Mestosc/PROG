import java.util.Arrays;

/**
 * Pruebas insercion de valores en lista ordenada
 */
public class InsercionOrdenada {
    public static void main(String[] args) {
        int[] lista = {1,2,3,4,4,6,7,8,9};
        int[] nuevas = insertarValor(lista,5);
        for (int nueva : nuevas) {
            System.out.println(nueva);
        }
    }

    /**
     * Insertar valor en una lista ordenada
     * @param list la lista a la que queremos introducir un nuevo valor
     * @param valor el valor que queremos introducir
     * @return si el valor existe devuelve una copia de la lista con el nuevo valor
     * si no existe devuelve una copia exacta de la lista a copiar originalmente
     */
    static int[] insertarValor(int[] list,int valor) {
        int[] nuevaLista; // Creamos una copia de la lista a la cual le añadimos 1 al indice
        int busqueda = Arrays.binarySearch(list,valor); // Hacemos la busqueda y guardamos el valor
        if (busqueda<0) { // Si el indice de busqueda es menor que 0 sabemos que el numero no existe y lo añadimos
            nuevaLista = new int[list.length+1];
            int indiceNuevo = -(busqueda+1); // Obtenemos el indice en el que iria el nuevo numero
            for (int i = 0; i < indiceNuevo; i++) { // Recorremos el bucle hasta el indice del nuevo elemento
                nuevaLista[i] = list[i]; // Añadimos los elementos de lista a nueva lista
            }
            nuevaLista[indiceNuevo] = valor; // Añadimos el nuevo valor que deseamos
            for (int j = indiceNuevo; j < list.length; j++) { /* Aqui viene el problema el indice al que añadir el nuevo valor
            existe en ambas listas por eso iteramos desde el indiceNuevo hasta el final de la lista original*/
                nuevaLista[j+1] = list[j]; /* Luego añadimos a la nuevaLista en j+1 que es indiceNuevo+1 al principio
                el valor de lista en j*/
            }
        }
        else { // En caso contrario indicara que ya existe
            System.out.println("Ya existe"); // Mostramos que existe
            return list; // Devolvemos la lista original
        }
        return nuevaLista;// Devolvemos la nueva lista
    }
}
