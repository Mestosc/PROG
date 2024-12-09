import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] horario = {{"Lunes"},{"Martes"},{"Miercoles"},{"Jueves"},{"Viernes"},
                            {"Matematicas","Historia","Deporte","Piscina","Compra"},
                            {"Compra","Piscina","","Compra",""}};
        mostrarHorario(horario);
        mostrarMenu(horario,sc);
        sc.close();
    }
    static void mostrarMenu(String[][] horario, Scanner sc) {
        int opcion;
        do {
            System.out.println("1. Cambiar Actividad\n2.Añadir actividad a posicion vacia\n3.Salir");
            System.out.println("Introduzca el numero de la opcion a usar");
            opcion = sc.nextInt();
            if (opcion==1) {
                cambiarActividad(horario,sc);
            } else if (opcion==2) {
                anadirActividad(horario,sc);
            }
        } while (opcion<3);
    }
    static void mostrarHorario(String[][] horario) {
        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                System.out.println(horario[i][j]);
            }
        }
    }
    static void cambiarActividad(String[][] horario,Scanner sc) {
        System.out.println("Introduzca la actividad que desea sustituir:");
        String actividadCambiar = sc.next();
        System.out.println("Introduzca la actividad por la que desea sustituir:");
        String actividadReemplazar = sc.next();
        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                if (horario[i][j].equalsIgnoreCase(actividadReemplazar)) {
                    horario[i][j] = actividadCambiar;
                }
                mostrarHorario(horario);
            }
        }
    }
    static void anadirActividad(String[][] horario,Scanner sc) {
        System.out.println("Introduzca actividad a añadir");
        String anadir = sc.next();
        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                if (horario[i][j].isEmpty()) {
                    horario[i][j] = anadir;
                    System.out.println("Desea añadir otra actividad");
                    String anadirOtra = sc.next();
                    if (anadirOtra.equalsIgnoreCase("No")) {
                        mostrarHorario(horario);
                        break;
                    }
                    mostrarHorario(horario);
                }
            }
        }
    }

}