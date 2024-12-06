import java.util.Arrays;

public class InsercionOrdenada {
    public static void main(String[] args) {
        int[] lista = {1,2,3,4,6,7,8,9};
        int[] nuevas = insertarValor(lista,5);
        for (int nueva : nuevas) {
            System.out.println(nueva);
        }
    }
    static int[] insertarValor(int[] list,int valor) {
        int[] nuevaLista = new int[list.length+1];
        int busqueda = Arrays.binarySearch(list,valor);
        int indiceNuevo = -(busqueda+1);
        if (busqueda<0) {
            for (int i = 0; i < indiceNuevo; i++) {
                nuevaLista[i] = list[i];
            }
            nuevaLista[indiceNuevo] = valor;
            for (int j = indiceNuevo; j < list.length; j++) {
                nuevaLista[j+1] = list[j];
            }
        }
        else {
            System.out.println("Ya existe");
        }
        return nuevaLista;
    }
}
