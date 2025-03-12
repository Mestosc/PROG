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
        dni = dni.toUpperCase();
        char[] letrasDNI = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'
        };
        int numero = Integer.parseInt(dni.substring(0,dni.length()-1));
        if (dni.length()==8 && letrasDNI[numero % 23]==dni.charAt(dni.length()-1)) {
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
