package Ejercicio2;

public abstract class Persoa extends Asociacion implements Miembro {
    private String dni;
    private String nome;

    public Persoa(String dni, String nome) {
        this.dni = dni;
        this.nome = nome;
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
    public String aCadea() {
        return "DNI: %s, Nombre:%s".formatted(dni,nome);
    }
}
