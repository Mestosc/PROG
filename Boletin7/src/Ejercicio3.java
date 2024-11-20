import java.util.Scanner;

/**
 * Hace lo mismo que Ejercicio2 pero añadiendo nombres y teniendo tambien otras funcionalidades
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int totalNotas=0,numeroAprobados=0,numeroSuspensos=0;
        Scanner sc = new Scanner(System.in);
        int[] notas = {5,2,8,3,4,5,6,1,5,6,
                7,2,4,3,2,5,4,7,8,9,
                10,4,2,6,1,6,3,6,4,3}; // La lista de notas
        String[] alumnos = {"Ana", "Beatriz", "Oscar", "Daniela", "Eduardo",
                "Fernando", "Gabriela", "Héctor", "Isabel", "Javier",
                "Karla", "Luis", "María", "Nicolás", "Olga",
                "Pablo", "Quintín", "Raquel", "Sofía", "Tomás",
                "Ulises", "Valeria", "Walter", "Ximena", "Yolanda",
                "Zacarías", "Andrea", "Bruno", "Carmen", "Diego"}; // Lista de alumnos
        int[] mayor = {5,2,8,3,4,5,6,1,5,6,
                7,2,4,3,2,5,4,7,8,9,
                10,4,2,6,1,6,3,6,4,3}; // Copiar valores lista de notas
        int mayorN=notas[0]; // Asumimos que la nota mayor es el primer elemento
        for (int nota : notas) {
            totalNotas += nota; // Haciendo la suma de todas las notas para la media
            if (nota >= 5) { // Si tienen 5 o mas estan aprobados y lo contamos
                numeroAprobados++; // Aumentando cuenta de los aprobados
            } else { // Si no tienen 5 o más estan suspensos y lo contamos
                numeroSuspensos++; // Aumentando cuenta de los suspensos
            }
            mayorN = Ejercicio2.obtenerNotaMayor(mayorN,nota);
        }
        System.out.println("El numero de aprobados es:" + numeroAprobados); // Mostrar el numero de aprobados
        System.out.println("El numero de suspensos es:" + numeroSuspensos); // Mostrar el numero de suspensos
        System.out.println("La media es de " + ((double) totalNotas / notas.length)); // Mostrar la media de notas
        System.out.println("La nota mayor es:" + mayorN); // Mostrar el numero mayor
        System.out.println();
        System.out.println("Los siguientes alumnos estan aprobados:");
        mostrarAprobados(notas, alumnos);
        System.out.println("Lista de notas en orden crecientes");
        ordenarCantidadesMenorMayor(mayor);
        for (int mayo : mayor) {
            System.out.println(mayo);
        }

        System.out.println("Introduzca el nombre de un alumno del que quiera saber la nota:");
        var nombreAlumno = sc.next();
        obtenerNombreNotaAlumno(nombreAlumno,alumnos,notas);
        sc.close();
    }

    /**
     * Ordena cantidades en una lista de menor a mayor
     * @param list la lista de numeros a ordenar
     */
    static void ordenarCantidadesMenorMayor(int[] list) {
            for (int j = 0; j<list.length-1; j++) {
                if (list[j]> list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
            }

    /**
     * Mostrar los alumnos aprobados pasando la lista de notas y de alumnos
     * @param notas las notas de los alumnos
     * @param alumnos los nombres de los alumnos
     */
    private static void mostrarAprobados(int[] notas, String[] alumnos) {
        for (int i = 0; i< notas.length; i++) { // Iteramos las notas
            if (notas[i]>5) { // Si las notas superan 5 entonces estan aprobados
                System.out.println(alumnos[i]);
            }
        }
    }

    /**
     * Obtener el nombre y la nota de un alumno especifico, ya que en este caso se asume que la nota
     * y alumno comparten indice se puede realizar de la siguiente manera pasandole los diferentes datos, basicamente de la lista
     * de alumnos obtenemos la nota
     * @param nombre Nombre del alumno del que queremos obtener la nota
     * @param alumnos la lista de alumnos
     * @param notas la lista de notas
     */
    static void obtenerNombreNotaAlumno(String nombre,String[] alumnos,int[] notas) {
        boolean existe = false;
        for (int k=0;k<alumnos.length;k++) {/* Para saber si un alumno con un nombre determinado esta aprobado
        iteramos los elementos de la lista de alumnos y vemos si coincide con el nombre introducido
        */
            if (nombre.equalsIgnoreCase(alumnos[k])) { // Verficamos si el nombre introducido coincide con cada alumno de la lista
                System.out.println("El alumno " + alumnos[k] + " tiene " + notas[k]);
                existe = true;
                break; /* Como en este caso no se repiten nombres que sean iguales
                y no es necesario sacar las notas de dos con el mismo nombre exacto
                se introduce un break para que despues de mostrar la nota salga directamente del bucle*/
            }
        }
        if (!existe) {
            System.out.println("El alumno: " + nombre + " no existe");
        }
    }

}
