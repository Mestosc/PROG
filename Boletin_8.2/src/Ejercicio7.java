
public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena1 = "gnome";
        String cadena2 = "kde";
        System.out.println(entreDosAnteriorOrdenAlfabetico(cadena1,cadena2));
        System.out.println(obtenerSiSubcadena("subcadea","cadea"));
    }

    /**
     * Descubrir si una cadena es subcadena de otra, si es subcadena es por que esa cadena es contenida dentro de la otra, por ejemplo
     * sub<strong>cadena</strong> y <strong>cadena</strong>
     * @param cadena1 cadena con la que se va a comparar
     * @param cadena2 cadena a comparar
     * @return verdadero si es una subcadena
     */
    static boolean obtenerSiSubcadena(String cadena1,String cadena2) {
        return cadena1.contains(cadena2);
    }

    /**
     * Devuelve una palabra, si esta alfabeticamente antes que otra si no devuelve la otra
     * @param texto1 la primera palabra a comparar
     * @param texto2 la segunda palabra a comparar
     * @return la palabra que este alfabeticamente antes
     */
    static String entreDosAnteriorOrdenAlfabetico(String texto1,String texto2) {
        if (texto1.compareToIgnoreCase(texto2)<0) {
           return texto1;
        }
        else {
            return texto2;
        }
    }
}
