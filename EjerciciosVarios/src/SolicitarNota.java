import java.util.Scanner;

public class SolicitarNota {
    public static void main(String[] args) {
        int nota3;
        Scanner preguntar = new Scanner(System.in);
        int nota = preguntar.nextInt();
        while (nota!=-1) {
            int nota2 = nota;
            nota= preguntar.nextInt();
            nota3 = (nota + nota2);
        }

    }
}
