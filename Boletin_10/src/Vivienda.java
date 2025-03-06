public class Vivienda extends BienInmob {
    boolean tenAdega;
    String observaciones;
    private int numeroHabitaciones;
    PlazaGaraje garaje;

    public Vivienda(String rua, String operacion, double prezo, String localidade, int numero, boolean hayGaraje) {
        super(rua, operacion, prezo, localidade, numero);
        if (hayGaraje) {
            garaje = new PlazaGaraje(rua,operacion,prezo,localidade,numero);
        }
    }
    @Override
    public double calcularGanancia() {
        return 0;
    }
}
