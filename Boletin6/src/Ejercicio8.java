/**
 * Calcular mediante un metodo la potencia n de m
 */
public class Ejercicio8 {
    public static void main(String[] args) {

    }
    static int calcularPotencia(int numero, int exponente){
        if (exponente==0) { /* Comprobamos el caso base que es el exponente 0 en cuyo caso
        se devuelve 1 como valr*/
            return 1;
        }
        return numero * calcularPotencia(numero,exponente-1); /* Retornamos el valor del numero y lo
        multiplicamos por la propia funcion
        */
    }
}
