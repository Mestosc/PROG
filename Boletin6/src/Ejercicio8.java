import java.util.Scanner;

/**
 * Calcular mediante un metodo la potencia n de m
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int numero,exponente,potencia;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca base de la potencia:");
        numero = scanner.nextInt();
        System.out.print("Introduzca exponente de la potencia:");
        exponente = scanner.nextInt();
        potencia = calcularPotencia(numero,exponente);
        System.out.println("La potencia de " + numero + " elevado a " + exponente + " :" + potencia);
    }

    /**
     * Calcular potencia mediante ejecucion recursiva
     * @param base es la base de la potencia
     * @param exponente el exponente de la potencia
     * @return Valor del numero multiplicado por la funcion haciendo que sea numero*numero hasta 0, que devuelve 1 y lo multiplica por acumulado devolviendo eso
     */
    static int calcularPotencia(int base, int exponente){
        if (exponente==0) { /* Comprobamos el caso base que es el exponente 0 en cuyo caso
        se devuelve 1 como valr*/
            return 1;
        }
        return base * calcularPotencia(base,exponente-1); /* Retornamos el valor del numero y lo
        multiplicamos por la propia funcion a la cual le vamos restando uno en exponente
        de esta manera multiplicara numero por si mismo pero cuando el exponente sea cero retornara eso y luego multiplicara
        el numero resultante por uno acabando las llamadas recursivas ya que la funcion no hace nada más
        */
    }
}
