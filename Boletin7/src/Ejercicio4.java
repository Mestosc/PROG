import java.util.Scanner; // Importamos la clase Scanner para poder ingresar entrada en el programa

/**
 * Nos devuelve la letra del DNI al introducirle el numero
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = {'T' ,'R', 'W', 'A', 'G', 'M', 'Y', 'F' ,'P', 'D', 'X', 'B', 'N', 'J',
                'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; // Array que contiene las letras letras del DNI
        System.out.print("Introduzca su DNI y yo le dire la letra:");
        var dni = sc.nextInt(); // Añadimos el Scanner para obtener el numero del DNI
        System.out.println("La letra de su DNI es:" + letras[dni%23]); /* En este caso en especifico el indice de la tabla letras es el resto del  numero del dni / 23 */
        sc.close(); // Cierre del Scanner
    }
}
