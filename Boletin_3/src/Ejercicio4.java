import java.util.Scanner;

public class Ejercicio4 {
    /**
     * Este codigo lo que hace es comparar el peso de dos personas cuyos datos ya tenemos mostrando
     * los datos de la persona con mayor peso y la diferencia entre el y la otra persona
     * @author oscar
     **/
    public static void main(String[] args) {
        Scanner saberPeso = new Scanner(System.in);
        String nombre1 = "Pitagoras";
        System.out.print("Introduce el peso de " + nombre1 + ":");
        int peso1 = saberPeso.nextInt();
        String nombre2 = "Mileto";
        System.out.print("Introduce el peso de " + nombre2 + ":");
        int peso2 = saberPeso.nextInt();
        if (peso1 > peso2) {
            System.out.println("El es " + nombre1 + " y pesa " + peso1 + "kg");
            System.out.println("La diferencia de peso entre el y " + nombre2 + " es de " +(peso1-peso2) + "kg");
        }
        else {
            System.out.println("El es " + nombre2 + " y pesa " + peso2 + "kg");
            System.out.println("La diferencia de peso entre el y " + nombre1 + " es de " +(peso2-peso1) + "kg");
        }
    }
}
