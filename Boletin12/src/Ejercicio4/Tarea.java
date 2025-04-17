package Ejercicio4;

import java.io.Serializable;

/**
 * Representacion de una tarea
 * @author Oscar R.
 * @version 1.0
 */
public class Tarea implements Serializable {
    private String nombreTarea;
    private String descripcion;
    Estado estado;

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
      * Constructor de tarea
      * @param nombreTarea: El nombre de la tarea
      * @param descripcion: Descripcion de la tarea 
      * @param estado: El estado de la tarea
      */
    public Tarea(String nombreTarea, String descripcion, String estado) {
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        setEstado(estado);
    }
    public void setEstado(String estado) {
        estado = estado.toUpperCase();
        Estado temp = Estado.valueOf(estado);
        if (temp==Estado.FEITA || temp==Estado.NON_FEITA) {
            this.estado = temp;
        } else {
            throw new RuntimeException("Estado non valido");
        }
    }

}
