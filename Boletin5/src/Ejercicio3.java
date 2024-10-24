import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Incializamos variables
        int base,altura;

        // Introduccion de datos
        Scanner datos = new Scanner(System.in);

        while (true){
            System.out.print("Introduzca la base del rectangulo (solo numeros positivos):");
            base = datos.nextInt();
            System.out.print("Introduzca la altura del rectangulo (solo numeros positivos):");
            altura = datos.nextInt();
            if (base<0 || altura<0) {
                System.out.println("Ha introducido un valor no valido");
            }
            else {
                break;
            }
        }

        System.out.println("El area del rectangulo: " + base*altura);
    }
}
