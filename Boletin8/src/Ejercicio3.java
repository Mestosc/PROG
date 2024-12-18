public class Ejercicio3 {
    public static void main(String[] args) {
        String te = "Java dende 0";
        String tex = inversionTexto(te);
        System.out.println(tex);
    }
    static String inversionTexto(String texto) {
        String textoInverso="";
        for (int i = texto.length()-1; i >= 0; i--) {
            textoInverso += texto.charAt(i);
        }
        return textoInverso;
    }
}
