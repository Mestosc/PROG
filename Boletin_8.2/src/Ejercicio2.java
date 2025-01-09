public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena = "separar";
        System.out.println(anadirComaEntreCaracteres(cadena));
        String cadena2 = "meu arquivo de texto.txt";
        System.out.println(cadena2.replace(" ","\\_"));
        String cadena3 = "1540";
        System.out.println(reemplazarNumerosPorX(cadena3));
        String cadena4 = "2552552550";
        System.out.println(insertarPuntoTresCaracteres(cadena4));

    }
    static String insertarPuntoTresCaracteres(String texto) {
        String cadena_final = "";
        for (int i = 0,j = 1; i < texto.length(); i++,j++) {
            char c = texto.charAt(i);
            cadena_final += c;
            if (j%3==0) {
                cadena_final += ".";
            }
        }
        return cadena_final;
    }
    static String reemplazarNumerosPorX(String texto) {
        String nuevo_texto = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isDigit(c)) {
                nuevo_texto += "X";
            }
        }
        return nuevo_texto;
    }
    static String anadirComaEntreCaracteres(String cadena) {
        StringBuilder cadena_nueva = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            cadena_nueva.append(c);
            if (i == cadena.length()-1)  {
                break;
            }
            cadena_nueva.append(',');
        }
        return cadena_nueva.toString(); /* Tambien se podria hacer con String concatenandolo yo al final lo hice asi
        el IDE no se me queja y funciona bien ya que simplemente va añadiendo al final el caracter y luego la coma yo lo hice asi por que de la otra manera me lie luego lo hice asi en el main y asi se quedo*/
    }
}
