
public class Ejercicio1 {
    public static void main(String[] args) {
        int valoresNegativos = 0;
        int valoresPositivos = 0;
        int valorCero = 0;
        // Aqui creo una lista que contiene los valores
        int[] valores = {20, -56, 43, -3, 0, -10, 67, 10, -6, 100};

        for(int cantNum = 0; cantNum<valores.length;cantNum++) {
            if (valores[cantNum] < 0) {
                valoresNegativos++;
            }
            else if (valores[cantNum] == 0) {
                valorCero++;
            }
            else {
                valoresPositivos++;
            }
        }
        System.out.println("La cantidad de valores negativos es:" + valoresNegativos);
        System.out.println("La cantidad de valores positivos es:" + valoresPositivos);
        System.out.println("La cantidad de valores que sean igual a 0 es:" + valorCero);

    }
}