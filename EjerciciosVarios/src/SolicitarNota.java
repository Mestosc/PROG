import java.util.Scanner;

public class SolicitarNota {
    public static void main(String[] args) {
        Scanner preguntar = new Scanner(System.in);

        while (true) {
            int nota = preguntar.nextInt();
            if (nota==-1) {
                break;
            }
            else {
                System.out.println(nota+(nota*30)/30);
            }
        }

    }
}
