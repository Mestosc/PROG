import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        //Creamos objeto millasNauticas para recibir datos
        Scanner millasNauticas = new Scanner(System.in);
        System.out.print("Indiqueme un valor en millas nauticas:");
        int cantMillasN = millasNauticas.nextInt();
        //Cerramos el flujo del objeto millasNauticas
        millasNauticas.close();
        final int MILLASN_METROS = 1852;
        System.out.println("La cantidad de " + cantMillasN + " millas nauticas equivale a " + cantMillasN* MILLASN_METROS + " metros");
    }
}
