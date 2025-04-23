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
	    System.out.print("1.Añadir Tarea\n2.Ver Tareas existentes\n3.Editar tareas\n4.Eliminar Tarea\n5.Salir\nIndique la opcion: ");
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
                    System.out.println();
                } catch (RuntimeException e) {
                    System.err.println("Ha habido un error al mostrar las tareas " + e.getMessage());
                }
            } case 3 -> {
                try {
                    System.out.println(tareas.obtenerTareas());
                    var numTarea = sc.nextInt();
                    tareas.tareas.remove(numTarea-1);
                } catch (RuntimeException e) {
                    System.err.println("No se han podido mostrar las tareas " + e.getMessage());
                }
            } case 4 -> {
                editarTarea(sc, tareas);
            }
        }
      } while (opcion!=5);
}

    private static void editarTarea(Scanner sc, Tareas tareas) {
        try {
            System.out.println(tareas.obtenerTareas());
            System.out.print("Introduzca el numero de tarea a editar: ");
            var numTarea = sc.nextInt();
            sc.nextLine();
            var tarea = tareas.tareas.get(numTarea-1);
            System.out.println("Que desea cambiar");
            System.out.println("1.Nombre\n2.Descripcion\n3.Estado");
            var opt = sc.nextInt();
            switch (opt) {
                case 1-> {
                    System.out.println("Introduzca el nuevo nombre de la tarea");
                    var nuevoNombre = sc.next();
                    sc.nextLine();
                    tarea.setNombreTarea(nuevoNombre);
                } case 2-> {
                    System.out.println("Introduzca la nueva descripcion de la tarea");
                    var nuevaDesc = sc.nextLine();
                    tarea.setDescripcion(nuevaDesc);
                } case 3 -> {
                    System.out.println("1.FEITA\n2.NON FEITA\nA que estado desea cambiar la tarea");
                    var nuevEst = sc.nextInt();
                    setEstadoTarea(nuevEst, tarea);
                }
        }
    } catch (RuntimeException e) {
            System.out.println("Ha habido un error en el procesamiento de tareas " + e.getMessage());
        }
    }

    private static void setEstadoTarea(int nuevEst, Tarea tarea) {
        Estado nuevoEstado = switch (nuevEst) {
            case 1 -> Estado.FEITA;
            case 2 -> Estado.NON_FEITA;
            default -> throw new IllegalStateException("Unexpected value: " + nuevEst);
        };
        tarea.setEstado(nuevoEstado);
    }
}
