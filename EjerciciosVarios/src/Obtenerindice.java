/**
 * Obtener Indice de una lista teniendo en cuenta un numero
 */
public class Obtenerindice {
    public static void main(String[] args) {
        int[] prueba = {1,2,3,4,5,6,7,8,9};
        System.out.println(obtenerIndiceListaOrdenados(prueba,4));
        int[] tablaD;
        tablaD = dividirTabla(prueba);

    }

    /**
     * Obtiene el indice de una lista si no obtiene -1
     * @param lista la lista de numeros de la que sacar numeros
     * @param num el numero que queremos comparar con los elementos de la lista
     * @return el numero del indice
     */
    static int obtenerIndiceLista(int[] lista, int num) {
        //int indiceElementos=0; // La inicializo como cero ya que si no al hacer el return o print si es una funcion vacia que hace eso no funciona correctamente
        for (int i = 0;i<lista.length;i++) {
            if (lista[i]==num) {
                return i;
            }
            else {
                return -1;
            }
        }
        return 0;
    }

    static int[] dividirTabla(int[]list) {
        int mitad = list.length/2;
        int[] nueva = new int[mitad];
        for (int i =0;i<nueva.length;i++) {
            nueva[i] = list[i];
        }
        return nueva;
    }
    static void ordenarCantidadesMenorMayor(int[] list) {
        for (int i = 0;i<list.length;i++) { // El bucle pasara por cada elemento de la lista una vez
            for (int j = 0; j<list.length-1-i; j++) { // Buscara por todos los valores de la lista menos 1 y el indice
                if (list[j]> list[j+1]) { // Si el elemento actual es menor que el siguiente realizamos la siguiente operacion
                    int temp = list[j]; // Guardamos el valor del elemento actual en una variable temporal
                    list[j] = list[j+1]; // Cambiamos el valor del elemento actual con el del siguiente
                    list[j+1] = temp; // Cambiamos el siguiente elemento por el valor de temp
                }
            }}
    }
    static int obtenerIndiceListaOrdenados(int[] lista, int num) {
        int mitad = lista.length / 2;
        int mitadD = mitad/2;
        if (lista[mitad]<num) {
            if (lista[mitadD]<num) {
                for (int i = mitadD+1;i<lista.length;i++) {
                    if (lista[i]==num) {
                        return i;
                    }
                }
            }
            else if (lista[mitadD]==num) {
                return mitadD;
            }
            else {
                for (int i = mitad+1;i<lista.length-mitadD;i++) {
                    if (lista[i]==num) {
                        return i;
                    }
                }

            }
        } else if (lista[mitad]==num) {
            return mitad;
        }
        else {
            if (num>mitadD) {
                for (int i = mitadD+1;i<mitad;i++) {
                    if (lista[i]==num) {
                        return i;
                    }
                }
            }
            else if (num==mitadD) return mitadD;
            else {
                for (int i = 0;i<mitadD;i++) {
                    if (lista[i]==num) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
