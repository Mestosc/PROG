public class Ejercicio11 {
    public static void main(String[] args) {
        String texto = "Ola, son alumno de DAM1, e son programador desde o 2024";
        contarDiferentesTiposCaracteres(texto);
    }
    static void contarDiferentesTiposCaracteres(String text) {
        int cantidadLetras=0,cantidadNumeros=0,cantidadEspacios=0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean esLetra = Character.isLetter(c);
            boolean esNumero = Character.isDigit(c);
            if (esLetra) {
                cantidadLetras++;
            } else if (esNumero) {
                cantidadNumeros++;
            } else if (c==' ') {
                cantidadEspacios++;
            }
        }
        System.out.println("Hay un total de " + cantidadLetras + " letras");
        System.out.println("Hay un total de " + cantidadNumeros + " numeros");
        System.out.println("Hay un total de " + cantidadEspacios + " espacios");
    }
}
