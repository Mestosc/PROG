package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    Tareas tareas  = new Tareas();
	    menu(sc,tareas);
   }
  static void menu(Scanner sc,Tareas tareas) {
      int opcion;      
      do {
	    System.out.println("1.Añadir Tarea\n2.Ver Tareas existentes\n3.Editar tareas\n4.Eliminar Tarea\nIndique la opcion:");
	    opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1-> {
                System.out.println("Introduzca nombre de la tarea:");
                var nombreTarea = sc.nextLine();
                System.out.println("Introduzca descripcion de la tarea:");
                var descripcionTar = sc.nextLine();
                System.out.println("Introduzca el estado de la tarea (Feita, Non Feita):");
                var estado = sc.nextLine();
                if (tareas.anadirTareas(nombreTarea,descripcionTar,estado)) {
                    System.out.println("Tarea introducida correctamente");
                } else {
                    System.out.println("Lo siento la tarea no se ha introducido directamente");
                }
            }
            case 2-> {
                try {
                    System.out.println(tareas.obtenerTareas());
                } catch (RuntimeException e) {
                    System.err.println("Ha habido un error al mostrar las tareas " + e.getMessage());
                }

            }
        }
      } while (opcion!=5);
}}
