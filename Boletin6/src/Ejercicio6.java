/**
 * Sirve para obtener determinados numeros(que la suma de dos divisores propios diferentes del mismo es numero1=numero2)
 * esta operacion se hace mediante el metodo especifico para ello
 * y mostrarlos por pantalla
 * @author Oscar Rodriguez
 * @version 1.0
 *  **/
public class Ejercicio6 {
    public static void main(String[] args) {
        boolean sonAmigos = numerosAmigos(220,284);
        if (sonAmigos) {
            System.out.println("Los numeros son amigos");
        }
    }

    /**
     * Comprobamos si los dos numeros son amigos
     * se entiende que son amigos
     * @param num1 el primer numero a introducir
     * @param num2 el segundo numero a introducir
     * @return nos dice si son amigos
     */
    static boolean numerosAmigos(int num1, int num2) {
        boolean comprobarDivisores1 = true, comprobarDivisores2 = false, sonAmigos; /* Incializamos la variable para comprobar si los numeros son divisores
         tambien inicializamos la variable para saber si son amigos*/
        for (int i = 1; i > num1 || i < num1 && i < num2; ) { // Iteramos una cantidad de veces mayor al primer numero y menor al segundo
            if (num1 % i == 0) { // Verificamos si la cantidad es divisor viendo si el residuo de num1 / i es 0
                i += i; // En cuyo caso sumamos
                comprobarDivisores1 = i == num2; // Si verificamos que la suma es igual a num
            }
        }
        for (int j = 1; j < num2 || j > num2 && j < num1; ) { // Iteramos una cantidad de veces mayor al segundo y menor al primero
            if (num2 % j == 0) {
                j += j;
                comprobarDivisores1 = j == num1;
            }


        }
        sonAmigos = comprobarDivisores1 && comprobarDivisores2;
        return sonAmigos;
    }
}
