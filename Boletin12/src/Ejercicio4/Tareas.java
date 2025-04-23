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
    public Tarea obtenerTareaNombre(String nombre) {
        Tarea te = null;
        for (Tarea t : tareas) {
            if (t.getNombreTarea().equals(nombre)) {
                te = t;
            }
        }
        if (te!=null) {
            return te;
        } else {
            throw new RuntimeException("No se ha encontrado la tarea");
        }
    }
    public void borrarTarea() {

    }
    public boolean anadirTareas(String nombre,String descripcion,String estado) {
       return tareas.add(new Tarea(nombre,descripcion,estado));
    }
    public String obtenerTareas() {
        String tareasF="";
        for (int i = 0;i<tareas.size();i++) {
            tareasF += (i+1) +" " +tareas.get(i).estado + " " + tareas.get(i).getNombreTarea() + " " + tareas.get(i).getDescripcion();
        }
        if (tareasF.isEmpty()) {
            throw new RuntimeException("No se han podido obtener tareas, es probable que no existan");
        }
        return tareasF;
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
