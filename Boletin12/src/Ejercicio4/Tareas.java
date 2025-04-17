package Ejercicio4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tareas {
    ArrayList<Tarea> tareas;
    public Tareas() {
        if (tareas!=null) tareas = leerTareas();
        else tareas = new ArrayList<>();
    }
    public ArrayList<Tarea> leerTareas(){
        ArrayList<Tarea> tareas1 = null;
        ObjectInputStream reader = null;
        try {
            reader = new ObjectInputStream(new FileInputStream("tareas.dat"));
            tareas1 = (ArrayList<Tarea>) reader.readObject();
        } catch (IOException e) {
            System.out.println("Error con el archivo " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("No se ha localizado la clase");
        } finally {
            if (reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Fallo al cerrar archivo" + e.getMessage());
                }
            }
        }
        return tareas1;
    }
    public boolean anadirTareas(String nombre,String descripcion,String estado) {
       return tareas.add(new Tarea(nombre,descripcion,estado));
    }
    public void escribirTareas(){
        ObjectOutputStream writer = null;
        try {
            writer = new ObjectOutputStream(new FileOutputStream("tareas.dat"));
            writer.writeObject(tareas);
        } catch (IOException e) {
            System.out.println("Error con el archivo " + e.getMessage());
        } finally {
            if (writer!=null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Fallo al cerrar archivo" + e.getMessage());
                }
            }
        }
    }
}
