package Ejercicio2;

public abstract class Trabajador extends Asociacion implements Miembro {
    private String dni;
    private String nome;
    private String dataIngreso;

    public Trabajador(String dni, String nome, String dataIngreso) {
        this.dni = dni;
        this.nome = nome;
        this.dataIngreso = dataIngreso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(String dataIngreso) {
        this.dataIngreso = dataIngreso;
    }

}
