import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena = sc.next();
        if (validarContrasena(contrasena,2,1,3,8)) {
            System.out.println("La contraseña es Valida");
        }
        else {
            System.out.println("La contraseña no es valida");
        }
    }
    /**
     * Comprueba la validez de una contraseña segun los siguientes parametros
     * @param contrasena la propia contraseña
     * @param mayusculas su numero de mayusculas
     * @param minusculas su numero de minusculas
     * @param numero su numero de numeros
     * @param longitud su longitud total
     * @return Verdadero si es valida en caso contrario falso
     */
    static boolean validarContrasena(String contrasena,int mayusculas, int minusculas, int numero,int longitud) {
        if (contrasena.length()>=longitud) {
            int cuentaMayusuclas=0,cuentaNumero=0,minuscula=0;
            for (int i = 0; i < contrasena.length(); i++) {
                char c = contrasena.charAt(i);
                if (Character.isUpperCase(c)) {
                    cuentaMayusuclas++;
                } else if (Character.isDigit(c)) {
                    cuentaNumero++;
                }
                else if (Character.isLowerCase(c)) {
                    minuscula++;
                }
            }

            return cuentaNumero >= numero && cuentaMayusuclas >= mayusculas && minuscula >=minusculas;
        }
        else {
            return false;
        }
    }
}
