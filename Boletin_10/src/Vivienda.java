public class Vivienda extends BienInmob {
    boolean tenAdega;
    String observaciones;
    PlazaGaraje garaje;

    public Vivienda(String rua, String operacion, double prezo, String localidade, int numero) {
        super(rua, operacion, prezo, localidade, numero);
    }

    @Override
    public double calcularGanancia() {
        return 0;
    }
}
