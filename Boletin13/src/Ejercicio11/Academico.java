package Ejercicio11;

public class Academico implements Comparable<Academico>{
    String nome;
    int anoIngreso;

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
