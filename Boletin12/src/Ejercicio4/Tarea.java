package Ejercicio4;

public class Tarea {
    String nombreTarea;
    String descripcion;
    Estado estado;

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
