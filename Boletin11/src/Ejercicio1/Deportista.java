package Ejercicio1;

import java.util.Date;

public class Deportista extends Persoa {
    String deporte;
    String club;
    String licencia;

    public Deportista(String nome, String direccion, String dni, String deporte, String club, String licencia) throws DniNonValido {
        super(nome, direccion, dni);
        this.deporte = deporte;
        this.club = club;
        setLicencia(licencia);
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        licencia = licencia.toLowerCase();
        Date fecha = new Date();
        boolean longitudYPrimerosNumeros = licencia.length()==13 && licencia.substring(0,4).equals(Integer.toString(fecha.getYear()));
        boolean tresSiguientesNumeros = licencia.substring(4,7).equalsIgnoreCase("fut") || licencia.substring(4,7).equalsIgnoreCase("bal");
        if (longitudYPrimerosNumeros && tresSiguientesNumeros) {
            this.licencia = licencia;
        }
        else {
            throw new RuntimeException("La licencia introducida no cumple con los requermientos de formato");
        }
    }
}
