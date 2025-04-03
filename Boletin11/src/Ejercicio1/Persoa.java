package Ejercicio1;

public class Persoa {
    private String nome;
    private String direccion;
    private String dni;
    public Persoa() {}
    public Persoa(String nome, String direccion, String dni) throws DniNonValido {
        this.nome = nome;
        this.direccion = direccion;
        setDni(dni);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }
    private char calcularDNILetra(String dni) {
        dni = dni.substring(0,8);
        final char[] LETRAS_DNI = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        return LETRAS_DNI[Integer.parseInt(dni)%23];
    }
    public void setDni(String dni) throws DniNonValido {
        if (dni.length()==9 && dni.charAt(8)==calcularDNILetra(dni)) {
            this.dni = dni;
        }
        else {
            throw new DniNonValido();
        }
    }
}
