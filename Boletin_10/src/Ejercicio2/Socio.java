package Ejercicio2;

public class Socio extends Asociacion implements Miembro {
    String dni;
    String nome;
    String direccion;
    String dataAlta;
    double cuotaMensual;
    @Override
    public void gastosIngresos() {
        Asociacion.beneficios += cuotaMensual;
    }
}
