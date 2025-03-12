package Ejercicio2;

public abstract class Persoa extends Asociacion {
    private String dni;
    private String nome;

    public Persoa(String dni, String nome) {
        setDni(dni);
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni.length()==8) {
            this.dni = dni;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String aCadea() {
        return "DNI: %s, Nombre:%s".formatted(dni,nome);
    }
    abstract void gastosIngresos();
}
