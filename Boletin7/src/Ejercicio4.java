import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = {'T' ,'R', 'W', 'A', 'G', 'M', 'Y', 'F' ,'P', 'D', 'X',
                'B',
                'N',
                'J',
                'Z',
                'S',
                'Q',
                'V',
                'H',
                'L',
                'C',
                'K',
                'E'};
        var dni = sc.nextInt();
        System.out.println("La letra de su DNI es:" + letras[dni%23]);
    }
}
