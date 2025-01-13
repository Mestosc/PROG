
public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena1 = "gnome";
        String cadena2 = "kde";
        System.out.println(entreDosAnteriorOrdenAlfabetico(cadena1,cadena2));
        System.out.println(obtenerSiSubcadena("subcadea","cadea"));
    }
    static boolean obtenerSiSubcadena(String cadena1,String cadena2) {
        return cadena1.contains(cadena2);
    }
    static String entreDosAnteriorOrdenAlfabetico(String texto1,String texto2) {
        if (texto1.compareToIgnoreCase(texto2)<0) {
           return texto1;
        }
        else {
            return texto2;
        }
    }
}
