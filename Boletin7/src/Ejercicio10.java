/**
 * Trabajando con valores en listas (Eliminacion)
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] num = {2,13,5,6,8,2,4};
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
        int[] nueva;
        int contador = 0;
        for (int num : lista) {
                if (num == valor) {
                    contador++;
                }
            }
        nueva = new int[lista.length-contador];
        for (int i = 0,j=0;i<lista.length;i++) { /* Hacemos un bucle for que itere la lista principal
        le añadimos una variable para iterar la nueva lista y el bucle acabara cuando la variable que itera la principal y la variable
        que itera la secundaria sean igual
        */
            if (lista[i]==valor) { // Si un elemento de la lista es igual al valor definido a eliminar volvemos al principio del bucle
                continue;
            }
            nueva[j] = lista[i]; // Hacemos que el valor de la nueva lista en un indice sea igual al de la lista principal en otro
            j++;// El valor del indice de la nueva lista solo se actualiza si se añade un elemento
        }
        return nueva;
        }
    }
