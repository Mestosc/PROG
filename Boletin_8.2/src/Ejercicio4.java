public class Ejercicio4 {
    public static void main(String[] args) {
        String numero = "1234567890";
        System.out.println(anadirSeparacionMiles(numero));
    }
    static String anadirSeparacionMiles(String num) {
        String cadena_nueva = "";
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            cadena_nueva += c;
            if (i%3==0 && i<num.length()-1) {
                cadena_nueva += '.';
            }
        }
        return cadena_nueva;
    }
}
