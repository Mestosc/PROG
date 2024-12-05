/**
 * Trabajando con valores en listas (Eliminacion)
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] num = {2,13,5,6,8,2,4};
        //Ejercicio3.ordenarCantidadesMenorMayor(num); // Ordenacion de la lista.
        for (int num1 : eliminarValor(num,5)){
            System.out.println(num1);
        }
    }

    /**
     * Elimina un valor n de una lista incluyendo repeticiones del mismo valor
     * @param lista la lista de la que queremos eliminar los valores
     * @param valor el valor que queremos eliminar
     * @return una lista que tiene todos los valores excepto el definido en el parametro valor
     */
    static int[] eliminarValor(int[]lista,int valor) {
        int[] nueva; // La nueva lista para añadirle sin el valor
        nueva = obtnerNuevaLista(lista, valor); // Obtenemos la nueva lista que queremos tener sin el valor a eliminar
        asignacionValoresNueva(lista, valor, nueva); // Asignamos a la nueva lista los valores de la anterior excepto el que queremos borrar
        return nueva; // Devolvemos los valores de la nueva lista
        }

    /**
     * Asignando valores a la nueva lista
     * @param lista la lista original de la que queremos pasar los valores
     * @param valor el valor que quiero que no aparezca en la nueva
     * @param nueva la lista a la queremos añadir los valores
     */
    static void asignacionValoresNueva(int[] lista, int valor, int[] nueva) {
        for (int i = 0, j = 0; i< lista.length; i++) { /* Hacemos un bucle for que itere la lista principal
        le añadimos una variable para iterar la nueva lista y el bucle acabara cuando la variable que itera la principal y la variable
        que itera la secundaria sean igual
        */
            if (lista[i]== valor) { // Si un elemento de la lista es igual al valor definido a eliminar volvemos al principio del bucle
                continue;
            }
            nueva[j] = lista[i]; // Hacemos que el valor de la nueva lista en un indice sea igual al de la lista principal en otro
            j++;// El valor del indice de la nueva lista solo se actualiza si se añade un elemento
        }
    }

    /**
     * Obtenemos un nuevo Array que sea la lista original quitandole el valor a eliminar
     * @param lista la lista orignial
     * @param valor el valor a borrar
     * @return la nueva lista sin las posiciones del valor original
     */
    static int[] obtnerNuevaLista(int[] lista, int valor) {
        int[] nueva;
        int contador = 0; //Declaramos un contador para contar la cantidad de veces que esta el valor a eliminar
        for (int num : lista) {
                if (num == valor) { // Si el numero es igual al valor a eliminar, incrementar contador
                    contador++; // Incrementar contador
                }
            }
        nueva = new int[lista.length-contador]; // Estableciendo la lista nueva restando a la longitud de la lista el contador
        return nueva; // Devolver nueva
    }
}
