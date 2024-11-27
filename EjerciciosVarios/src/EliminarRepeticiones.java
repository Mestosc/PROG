
public class EliminarRepeticiones {
    public static void main(String[] args) {

    }
    static int[] LocalizarRepeticion(int[]lista) {
        int[] repeticiones;
        int contarRepeticiones = 0;
        for (int i = 0;i<lista.length;i++) {
            for (int j = 0;j<lista.length-i-1;j++) {
                if (lista[j]==lista[j+1]) {
                    contarRepeticiones++;
            }}
        }
        repeticiones = new int [lista.length-contarRepeticiones];
        for (int i = 0;i<lista.length;i++) {
            for (int j = 0;j<lista.length-i-1;j++) {
                if (lista[j]==lista[j+1]) {

                }
        }
    }
        return repeticiones;
}}
