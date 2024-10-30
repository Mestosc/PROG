import java.util.Scanner;

/**
 * Sirve para obtener determinados numeros(que la suma de dos divisores propios diferentes del mismo es numero1=numero2)
 * esta operacion se hace mediante el metodo especifico para ello
 * y mostrarlos por pantalla
 * @author Oscar Rodriguez
 * @version 1.0
 *  **/
public class Ejercicio6 {
    public static void main(String[] args) {
        int primerNumero,segundoNumero; // Declaramos
        Scanner introducir = new Scanner(System.in); // Creando instancia de la clase Scanner
        System.out.print("Introducir primer numero:");
        primerNumero = introducir.nextInt();
        System.out.print("Introducir segundo numero:");
        segundoNumero = introducir.nextInt();
        boolean sonAmigos = numerosAmigos(primerNumero,segundoNumero); // Llamar a numerosAmigos para obtener si dos numeros son amigos

        if (sonAmigos) { // En caso de que sean amigos mostraremos eso
            System.out.println("Los numeros " + primerNumero + " y " + segundoNumero + " son amigos"); // Mensaje de que los numeros son amigos
        }
        else { // En caso de que los numeros no sean amigos
            System.out.println("No son amigos"); // Mensaje de que no son amigos
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
        int sumaDivisores1 = 0,sumaDivisores2 = 0; // Aqui se guardara la suma de los divisores de ambos numeros para realizar la comprobacion
        boolean sonAmigos; /* Incializamos la variable para comprobar si los numeros son divisores
         tambien inicializamos la variable para saber si son amigos*/
        for (int i = 1; i < num1;i++) { //
            if (num1 % i == 0) { // Verificamos si la cantidad es divisor viendo si el residuo de num1 / i es 0
                sumaDivisores1 += i; // En cuyo caso sumamos
            }

        }
        for (int j = 1; j < num2;j++) { // Iteramos desde 1 hasta un numero menos que num2
            if (num2 % j == 0) { // Verificamos si la cantidad es divisor viendo si el residuo de num2 / i es 0
                sumaDivisores2 += j; // Lo añadimos a la suma de divisores
            }
        }
        sonAmigos = sumaDivisores1 == num2 && sumaDivisores2 == num1; // Verificamos si son Amigos
        return sonAmigos; // Obtenemos si es verdadero o falso
    }
}
