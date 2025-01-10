public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("011010",2));
        System.out.println(conversionManual("011010"));
    }
    static int conversionManual(String numero) {
        int numero_entero = 0;
        for (int i =0; i < numero.length(); i++) {
            int bit = Character.getNumericValue(numero.charAt(numero.length()-1-i));
            numero_entero += (int) (bit * Math.pow(2,i));
        }
        return numero_entero;
    }
}
