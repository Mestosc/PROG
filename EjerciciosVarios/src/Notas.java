import java.util.Scanner;
/**
 * Permite saber a partir de la nota numerica saber si esta suspenso, si es suficiente si esta aprobado o tiene notable
 * o sobresaliente
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Notas {
    public static void main(String[] args) {
        Scanner valorN = new Scanner(System.in);
        System.out.print("Introduzca la nota del alumnado:");
        int nota = valorN.nextInt();
        switch (nota){
            case 0,1,2,3,4:
                System.out.println("Tu nota es insuficiente");
                break;
            case 5:
                System.out.println("Tu nota es suficiente");
                break;
            case 6:
                System.out.println("Tu nota es buena");
                break;
            case 7,8:
                System.out.println("Tu nota es un notable");
                break;
            case 9,10:
                System.out.println("Tu nota es un sobresaliente");
                break;
            default:
                System.out.println("Has introducido un valor no valido");
        }
    }
}
