
public class Ejercicio1 {
    /**
     * Sirve para iterar un conjunto de numeros y saber si es positivo o negativo o cero
     * @author Oscar Rodriguez
     * @version 1.0
     * **/
    public static void main(String[] args) {
        // Creamos variables para definir la cantidad de los tipos de valores que en principio es 0
        int valoresNegativos = 0;
        int valoresPositivos = 0;
        int valorCero = 0;

        // Aqui creo una lista que contiene los valores tanto positivos como negativos
        int[] valores = {20, -56, 43, -3, 0, -10, 67, 10, -6, 100};

        /* Introduzco un bucle for que itere cada elemento de la lista, luego usamos un condicional*/
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