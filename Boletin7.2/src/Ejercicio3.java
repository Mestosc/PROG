import java.util.Scanner;

/**
 * Recreacion del juego hundir la flota
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] barcos = {{"~", "B", "~", "~"},
                {"~", "B", "~", "~"},
                {"B", "B", "B", "B"},
                {"~", "B", "~", "~"}};
        mostrarTablero(barcos); // Mostrar tablero sin barcos solo como agua
        iniciarJuego(sc,barcos); // Iniciamos el juego pasando el tablero y el Scanner
        finalizacion(barcos); // Como proceder cuando finaliza
        sc.close(); // Cerrando el Scanner
    }

    /**
     * Funcion principal de Juego
     * @param sc le pasamos el scanner declarado en la principal lo hago así para no liarme con declararlo en el metodo
     * @param barcos el tablero con los barcos
     */
    static void iniciarJuego(Scanner sc, String[][] barcos) {
        int contador=0;
        do {
        System.out.println("Introduzca primera coordenada para disparar:");
        int coordenada1 = sc.nextInt();
        System.out.println("Introduzca segunda coordenada para disparar:");
        int coordenada2 = sc.nextInt();
        contador += disparar(barcos,coordenada1,coordenada2);
        } while (contador <7);
    }

    /**
     * Mostramos el tablero sin los barcos para que se vea como es
     * @param tablero el tablero es necesario para poder obtener las dimensiones del mismo e ir mostrando
     */
    static void mostrarTablero(String[][] tablero) {
        for (String[] strings : tablero) {
            for (int j = 0; j < strings.length; j++) {
                System.out.print("~");
            }
            System.out.print("\n");
        }
    }

    /**
     * Disparar a un barco, en el juego hundir la flota
     * @param tablero el tablero donde jugamos
     * @param coordenada1 La fila a la que disparamos
     * @param coordenada2 La columna a la que disparamos
     * @return El valor del contador
     */
    static int disparar(String[][] tablero, int coordenada1, int coordenada2) {
        int cont=0;
        if (saberNave(tablero[coordenada1][coordenada2])){
            System.out.println("Ha disparado a el barco ubicando en las coordenadas " + coordenada1 + " " + coordenada2);
            tablero[coordenada1][coordenada2] = "X"; // Cambiamos el valor del tablero en esas coordenadas a "X"
            cont++; // Aumentamos el contador
            actualizarTablero(tablero); // Actualizamos el tablero
            return cont; // Devolvemos el valor final del contador
        }
        else {
            System.out.println("Ha disparado a agua"); // Indicamos que disparamos a agua
        }
        return 0; // Si no se cumple la condicion detonante
    }

    /**
     * Mostrar cambio en tablero al abatir un barco
     * @param tablero le pasamos el tablero
     */
    static void actualizarTablero(String[][] tablero) {
        for (String[] strings : tablero) { // Recorremos filas
            for (String string : strings) { // Recorremos columnas
                if (string.equals("X")) { // Si lo que hay en la fila y columna es X
                    System.out.print("X"); // Mostramos X
                }
                System.out.print("~"); // En todos los demás casos mostramos agua
            }
            System.out.println(); // Añadiendo los saltos de linea
        }
    }

    /**
     * Saber si disparamos a un barco
     * @param valorCoordenadas el valor de las coordenadas donde esta lo que queremos comprobar
     * @return verdadero si es un barco falso si no
     */
    static boolean saberNave(String valorCoordenadas) {
        return valorCoordenadas.equals("B");
    }

    /**
     * Funcion de finalizacion
     * @param tablero le pasamos el tablero para que muestre el resultado final
     */
    static void finalizacion(String[][] tablero) {
        for (String[] strings : tablero) { // Recorremos el tablero haciendo que cada una de las filas sean cojidas como una lista de String
            for (String string : strings) { // Y el contenido de cada fila como un string
                System.out.print(string);
            }
            System.out.println();
        }
        System.out.println("Enorabuena has avatido todos los barcos");
    }
}
