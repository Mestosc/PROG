package Ejercicio11;

/**
 * Clase que define a un Academico de la RAE
 */
public class Academico implements Comparable<Academico>{
    String nome;
    int anoIngreso;

    /**
     * Generamos el objeto de la clase Academico con los datos requeridos
     * @param nome El nombre del usuario
     * @param anoIngreso el año en el que ingreso
     */
    public Academico(String nome,int anoIngreso) {
        this.nome = nome;
        this.anoIngreso = anoIngreso;
    }
    public String toString() {
        return nome;
    }
    @Override
    public int compareTo(Academico academico) {
        return nome.compareTo(academico.nome);
    }
}
