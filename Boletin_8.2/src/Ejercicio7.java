
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println(entreDosAnteriorOrdenAlfabetico("gnome","kde"));
    }
    static boolean obtenerSiSubcadena(String cadena1,String cadena2) {
        boolean esSubcadena = false;
        for (int i = 0, j = 2; i < cadena1.length() && j < cadena2.length(); i++,j++) {
            char cadena1prob = cadena1.charAt(i);
            char cadena2prob = cadena2.charAt(j);
            if (cadena1prob==cadena2prob) {

            }
        }
    }
    static String entreDosAnteriorOrdenAlfabetico(String texto1,String texto2) {
       char texto1Primera = texto1.charAt(0);
       char texto2Primera = texto2.charAt(0);
       if (texto2Primera>texto1Primera) {
           return texto1;
       }
       else {
           return texto2;
       }
    }
}
