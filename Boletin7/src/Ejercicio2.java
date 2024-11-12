/**
 * Mirar numero de aprobados, suspensos, media y la nota mayor
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroAprobados=0, numeroSuspensos=0,totalNotas=0;
        int[] notas = {5,2,9,3,4,5,6,1,5,6,7,2,4,3,2,5,4,7,8,9,10,4,2,6,1,6,3,6,4,3};
        int mayor=notas[0]; // Asumimos que la nota mayor es el primer elemento
        for (int nota : notas) {
            mayor = obtenerMayor(nota,mayor);
            totalNotas += nota; // Haciendo la suma de todas las notas para la media
            if (nota >= 5) { // Si tienen 5 o mas estan aprobados y lo contamos
                numeroAprobados++; // Aumentando cuenta de los aprobados
            } else { // Si no tienen 5 o más estan suspensos y lo contamos
                numeroSuspensos++; // Aumentando cuenta de los suspensos
            }
        }
        System.out.println("El numero de aprobados es:" + numeroAprobados); // Mostrar el numero de aprobados
        System.out.println("El numero de suspensos es:" + numeroSuspensos); // Mostrar el numero de suspensos
        System.out.println("La media es de " + ((double) totalNotas / notas.length)); // Mostrar la media de notas
        System.out.println("La nota mayor es:" + mayor); // Mostrar el numero mayor
    }

    /**
     * Funcion que obitiene que comprueba si la nota es mayor a la nota mayor previamente definida y le da su valor
     * @param nota La nota que queremos comparar
     * @param mayor El numero que asumimos como mayor
     * @return El numero mayor real
     */
    public static int obtenerMayor(int nota,int mayor) {
        if (nota > mayor) { /*Si la nota desde el segundo elemento es mayor a la nota del primer elemento que*
            que consideramos mayor mayor sera asginado a ese elemento al iterar eso podremos averiguar cual es el numero mayor*/
            mayor = nota;
            return mayor;
        }
        return mayor;
    }
}
