public class Ejercicio10 {
    public static void main(String[] args) {
        int valor1 = 20;
        int valor2 = 30;
        int resultado = maximoDivisorComun(valor1,valor2);
        System.out.println(resultado);
    }

    /**
     * Obtener el maximo divisor comun de forma recursiva
     * @param valor1 el primer valor del que queremos saber el divisor
     * @param valor2 el segundo valor del que queremos hacer el divisor
     * @return devuelve el maximo divisor comun
     */
    static int maximoDivisorComun(int valor1, int valor2) {
        if (valor2 == 0) { // Verificamos si el valor2 es 0
            return valor1; // Entonces el maximo divisor comun es a
        }
        return maximoDivisorComun(valor2,valor1%valor2); /* Devuelve la propia funcion
        convirtiendo el valor2 en valor1 y luego valor2 en el resto de valor 1 y valor2
        cuando este valor2 sea 0 el resultado sera el primer valor mostrandonos asi el resultado deseado
        */
    }
}
