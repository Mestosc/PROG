package Ejercicio2;

public class Voluntarios extends Persoa implements Miembro {

    public Voluntarios(String dni, String nome, String dataIngreso) {
        super(dni, nome, dataIngreso);
    }

    @Override
    public void gastosIngresos() {
        beneficios -= 3;
    }
}
