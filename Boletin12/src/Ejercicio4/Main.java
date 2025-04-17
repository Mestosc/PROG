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
        switch (opcion) {
            case 1-> {

            }
        }
      } while (opcion!=5);
}}
