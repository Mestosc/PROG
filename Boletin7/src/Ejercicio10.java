public class Ejercicio10 {
    public static void main(String[] args) {
        int[] num = {2,13,5,6,8,9,4};
        for (int num1 : EliminarValor(num,5)){
            System.out.println(num1);
        }
    }
    static int[] EliminarValor(int[]lista,int valor) {
        int[] nueva = new int[1];
        int contador = 0;
        for (int num : lista) {
                if (num != valor) {
                    contador++;
                }
            }
        nueva = new int[contador];
        for (int j=0;j<nueva.length;j++){
            if (lista[i]!=valor) {
            nueva[j] = lista[j];
            }
        }
        return nueva;
        }
    }
