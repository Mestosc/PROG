public class Ejercicio6 {
    public static void main(String[] args) {
        int[] listaOrdenada = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(obtenerIndiceListaOrdenados(listaOrdenada, 10));

    }

    /**
     * De una lista de numeros enteros ordenados saca el indice del numero deseado
     *
     * @param lista la lista de enteros de la que queremos saber un indice de numeros
     * @param num   el numero del que queremos saber el indice
     * @return el indice del numero
     */
    static int obtenerIndiceListaOrdenados(int[] lista, int num) {
        int mitad = lista.length / 2; // La mitad de la lista
        int mitadI = mitad / 2; // La mitad desde el lado izquierdo
        int mitadD = mitad + mitadI; // La mitad de la derecha para lo cual hay que sumarle mitad + mitad izquierda
        if (lista[mitad] < num) { // Si el numero es mayor a lo que hay en la mitad de la lista
            if (lista[mitadD] < num) { // Verificaremos primero si es mayor a lo que hay en la segunda mitad de la mitad derecha de la lista
                for (int i = mitadD + 1; i < lista.length; i++) { // Si asi es procederemos a iterar desde un numero mas que la segunda mitad hasta el final de la lista
                    if (lista[i] == num) { // Comprobaremos si los elementos de esa iteracion son iguales a num en cuyo caso devolveremos el indice y acabariamos ahi la funcion
                        return i; // Devolviendo el indice
                    }
                }
            } else if (lista[mitadD] == num) // Si el numero es igual a la segunda mitad devolvemos eso
                return mitadD;

            else {
                for (int i = mitad + 1; i < mitadD; i++) {
                    if (lista[i] == num) {
                        return i;
                    }
                }

            }
        } else if (lista[mitad] == num)
            return mitad; // Si el numero es igual a lo que hay en la mitad de la lista entonces devuelve la mitad

        else {
            if (num > lista[mitadI]) {
                for (int i = mitadI + 1; i < mitad; i++) {
                    if (lista[i] == num) {
                        return i;
                    }
                }
            } else if (num == lista[mitadI]) return mitadI;
            else {
                for (int i = 0; i < mitadI; i++) {
                    if (lista[i] == num) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}