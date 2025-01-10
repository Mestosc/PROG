
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println(entreDosAnteriorOrdenAlfabetico("gnome","kde"));
        System.out.println(obtenerSiSubcadena("subcadea","cadea"));
    }
    static boolean obtenerSiSubcadena(String cadena1,String cadena2) {
        return cadena1.contains(cadena2);
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
