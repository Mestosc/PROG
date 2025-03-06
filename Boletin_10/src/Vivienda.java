public class Vivienda extends BienInmob {
    boolean tenAdega;
    String observaciones;
    private int numeroHabitaciones;
    PlazaGaraje garaje;

    public Vivienda(String rua, String operacion, double prezo, String localidade, int numero, PlazaGaraje garaje) {
        super(rua, operacion, prezo, localidade, numero);
        this.garaje = garaje;
    }
    @Override
    public double calcularGanancia() {
        return 0;
    }
}
