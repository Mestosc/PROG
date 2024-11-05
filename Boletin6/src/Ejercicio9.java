public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println(mostrarFibonnaci(10));
    }

    /**
     * Funcion para devolver los numeros de Fibonnaci, en una posicion determinada
     * @param num1 la posicion en la serie Fibonnacci
     * @return Los numeros de la serie de Fibonnaci
     */
    static int mostrarFibonnaci(int num1) {
        if (num1==0) {
            return 0;
        }
        else if (num1==1){
            return 1;
        }
        return mostrarFibonnaci(num1-1) + mostrarFibonnaci(num1-2);
    }
}
