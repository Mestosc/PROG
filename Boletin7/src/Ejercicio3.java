import java.util.Scanner;

/**
 * Hace lo mismo que Ejercic3io2 pero añadiendo nombres y teniendo tambien otras funcionalidades
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Ejercicio3 {
    public static void main(String[] args) {
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
                10,4,2,6,1,6,3,6,4,3};
        System.out.println("Los siguientes alumnos estan aprobados:");
        for (int i = 0;i<notas.length;i++) { // Iteramos las notas
            if (notas[i]>5) { // Si las notas superan 5 entonces estan aprobados
                System.out.println(alumnos[i]);
            }
        }
        System.out.println("Lista de notas en orden crecientes");
        /* TODO Hacer y mostrar ordenacion de notas de menor a mayor
        * Lo del To-Do es cosa del IDE para registrar que la tarea esta pendiente
        * no encuentro una forma de hacer la ordenacion que coincida con los requisitos
        * se que hay alguna manera de hacerlo usando la clase Arrays*/

        System.out.println("Introduzca el nombre de un alumno del que quiera saber la nota:");
        var nombreAlumno = sc.next();
        obtenerNombreNotaAlumno(nombreAlumno,alumnos,notas);
    }
    static void obtenerNombreNotaAlumno(String nombre,String[] alumnos,int[] notas) {
        for (int k=0;k<alumnos.length;k++) {/* Para saber si un alumno con un nombre determinado esta aprobado
        iteramos los elementos de la lista de alumnos y vemos si coincide con el nombre introducido
        */
            if (nombre.equalsIgnoreCase(alumnos[k])) { // Verficamos si el nombre introducido coincide con cada alumno de la lista
                System.out.println("El alumno " + alumnos[k] + " tiene " + notas[k]);
                break; /* Como en este caso no se repiten nombres que sean iguales
                y no es necesario sacar las notas de dos con el mismo nombre exacto
                se introduce un break para que despues de mostrar la nota salga directamente del bucle*/
            }
        }
    }

}
