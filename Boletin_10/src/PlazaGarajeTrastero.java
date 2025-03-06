public class PlazaGarajeTrastero extends PlazaGaraje {
    double superficie;
    public PlazaGarajeTrastero(String rua, String operacion, double prezo, String localidade, int numero, double largo, int numeroPlaza, double ancho, double superficie) {
        super(rua, operacion, prezo, localidade, numero, largo, numeroPlaza, ancho);
        this.superficie = superficie;
    }
}
