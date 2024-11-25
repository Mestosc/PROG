/**
 * Obtener Indice de una lista teniendo en cuenta un numero
 */
public class Obtenerindice {
    public static void main(String[] args) {
        int[] prueba = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        //System.out.println(obtenerIndiceListaOrdenados(prueba,3));
        int[] tablaD;
        tablaD = dividirTabla(prueba);
        System.out.println(obtenerIndiceLista(tablaD,2));
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
}
