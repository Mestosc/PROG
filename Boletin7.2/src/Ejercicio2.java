import java.util.Scanner;

/**
 * Juego tesoro basico
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] habitaculo = {{"Tramapa","Dormitorio","Trampa"},{"Tesoro","Entrada","Trampa"},{"Tesoro","Trampa","Trampa"}};
        System.out.println("Tenga en cuenta que las coordenadas son desde 0");
        System.out.println("Introduzca fila");
        var coordenada1 = sc.nextInt();
        System.out.println("Introduzca columna");
        var coordenada2 = sc.nextInt();
        elegirHabitaculo(habitaculo,coordenada1,coordenada2);
    }

    /**
     * Seleccionar la habitacion a verificar
     * @param habitaciones le pasamos la lista de habitaciones a comprobar
     * @param coordenada1 la primera coordenada en la tabla
     * @param coordenada2 la segunda coordenada en la tabla
     */
    static void elegirHabitaculo(String[][] habitaciones,int coordenada1, int coordenada2){
        if (habitaciones[coordenada1][coordenada2].equalsIgnoreCase("Tesoro")) {
            System.out.println("Enorabuena has ganado");
        } else if (habitaciones[coordenada1][coordenada2].equalsIgnoreCase("Trampa")) {
            System.out.println("Has caido en una trampa");
        }
        else if (habitaciones[coordenada1][coordenada2].equalsIgnoreCase("Entrada")) {
            System.out.println("¿Realmente quieres salir?");
        }
        else {
            System.out.println("Has entrado a un dormitorio.Crees tener tiempo para dormir no?");
        }
    }
}
