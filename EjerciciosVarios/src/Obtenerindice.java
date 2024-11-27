/**
 * Obtener Indice de una lista teniendo en cuenta un numero
 */
public class Obtenerindice {
    public static void main(String[] args) {
        int[] prueba = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        //System.out.println(obtenerIndiceListaOrdenados(prueba,3));
        int[] tablaD;
        tablaD = dividirTabla(prueba);
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
