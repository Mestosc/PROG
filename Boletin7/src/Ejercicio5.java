public class Ejercicio5 {
    public static void main(String[] args) {
        int[] list = {23,145,654,32,15,6,7,8,9,10};
        System.out.println(obtenerIndiceLista(list,23));
    }
    /**
     * Obtiene el indice de una lista si no obtiene -1
     * @param lista la lista de numeros de la que sacar numeros
     * @param num el numero que queremos comparar con los elementos de la lista
     * @return el numero del indice
     */
    public static int obtenerIndiceLista(int[] lista, int num) {
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
}
