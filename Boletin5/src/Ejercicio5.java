import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double sueldo;
        int cantTrabajadoresMas1000=0, cantTrabajadoresMenos1000=0, trabajdoresTotal=0;
        Scanner recibir = new Scanner(System.in);
        System.out.print("Introduzca sueldo");
        sueldo = recibir.nextInt();
        while (sueldo!=0) {
            if (sueldo>0) {
             if (sueldo>=1000 && sueldo<=1750) {
                cantTrabajadoresMas1000++;
                trabajdoresTotal++;
                sueldo = recibir.nextInt();
            }
             else if (sueldo<1000) {
                cantTrabajadoresMenos1000++;
                trabajdoresTotal++;
                sueldo = recibir.nextInt();
            }
        } else {
            sueldo = recibir.nextInt();}
        }
        if (trabajdoresTotal>0) {
            System.out.println("El porcentaje de trabajadores que cobran entre 1.000 y 1.750 es:" + (cantTrabajadoresMas1000 / trabajdoresTotal) * 100);
        }
        else {
            System.out.println("No se han introducido trabajadores es imposible hacer un calculo");
        }
    }
}
