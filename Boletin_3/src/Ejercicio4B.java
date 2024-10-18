public class Ejercicio4B {
    /**
     *
     * En este caso usaremos el condicional ternario para asignar los valores a variables dependiendo
     * de si el peso1 o el peso2 son mayor o menor la diferencia es que aqui, tenemos que crear nuevas variables
     * que almacenan diferentes valores dependiendo de el valor de peso1 y peso2, y luego lo muestra por pantalla
     * siendo relativamente parecido al 4a, pero el 4a es mas sencillo ya que no requiere añadir nuevas variables que ocupen espacio en memoria
     * además es más intuitivo en el aspecto logico
     * esto era de ejemplo de uso del condicional ternario
     * @author Oscar Rodriguez
     * @version 1.0
     * **/
    public static void main(String[] args) {
        String nombre1 = "Pitagoras";
        String nombre2 = "Mileto";
        int peso1 = 80;
        int peso2 = 70;
        int pesoReal = (peso1>peso2) ? peso1:peso2;
        String nombreReal = (peso1>peso2) ? nombre1:nombre2;
        int diferencia = (peso1>peso2) ? peso1-peso2:peso2-peso1;
        String otroNombre = (peso1>peso2) ? nombre2:nombre1;
        System.out.println("La persona con mayor peso es " + nombreReal + " y pesa " + pesoReal + "kg ");
        System.out.println("La diferencia entre el y " + otroNombre + " " + diferencia + "kg");


    }
}
