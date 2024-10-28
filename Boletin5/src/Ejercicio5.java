import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double sueldo;
        int cantTrabajadoresMas1000=0, cantTrabajadoresMenos1000=0, trabajdoresTotal=0;
        Scanner recibir = new Scanner(System.in);
        System.out.print("Introduzca sueldo:");
        sueldo = recibir.nextDouble();
        while (sueldo!=0) {
            if (sueldo>0) {
             if (sueldo>=1000 && sueldo<=1750) {
                cantTrabajadoresMas1000++;
                trabajdoresTotal++;
                sueldo = recibir.nextDouble();
            }
             else if (sueldo<1000) {
                cantTrabajadoresMenos1000++;
                trabajdoresTotal++;
                sueldo = recibir.nextDouble();
            }
        } else {
            sueldo = recibir.nextDouble();}
        }
        if (trabajdoresTotal>0) {
            System.out.printf("El porcentaje de trabajadores que cobran entre 1.000 y 1.750 es: %.2f%%\n", ((double)cantTrabajadoresMas1000 /(double)trabajdoresTotal) * 100);
            System.out.printf("El porcentaje de trabajadores que cobran entre que cobran menos de 1.000 es: %.2f%%\n", (cantTrabajadoresMenos1000 /(double)trabajdoresTotal) * 100);
        }
        else {
            System.out.println("No se han introducido trabajadores es imposible hacer un calculo");
        }
    }
}
