public class Ejercicio4 {
    /**
     * Este codigo lo que hace es comparar el peso de dos personas cuyos datos ya tenemos mostrando
     * los datos de la persona con mayor peso y la diferencia entre el y la otra persona
     * @author oscar
     **/
    public static void main(String[] args) {
        String nombre1 = "Pitagoras";
        int peso1 = 80;
        String nombre2 = "Mileto";
        int peso2 = 70;
        if (peso1 > peso2) {
            System.out.println("El es " + nombre1 + " y pesa " + peso1 + "kg");
            System.out.println("La diferencia de peso entre el y " + nombre2 + " es de " +(peso1-peso2) + "kg");
        }
        else {
            System.out.println("El es " + nombre2 + " y pesa " + peso2 + "kg");
            System.out.println("La diferencia de peso entre el y " + nombre1 + " es de " +(peso2-peso1) + "kg");
        }
    }
}
