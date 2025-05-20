package Ejercicio11;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character,Academico> academia = new HashMap<>();
        Academico academico0 = new Academico("Abel del Sn",1900);
        Academico academico1 = new Academico("Ana de la rosa",1999);
        Academico academico2 = new Academico("Jorge de la piedra",2001);
        nuevoAcademico(academia,academico0,'Z');
        if (nuevoAcademico(academia,academico1,'S')) {
            System.out.println("Academico añadido");
        }
        nuevoAcademico(academia,academico2,'R');
        System.out.println(academia);
        List<Academico> academicos = new ArrayList<>(List.copyOf(academia.values()));
        Collections.sort(academicos);
        System.out.println(academicos);
    }

    /**
     * Añade un nuevo academico a un Map que es normalmente la academia
     * @param academia la academia a la que pertenecen los academicos
     * @param novo el nuevo academico a introducir
     * @param letra la letra a la que esta asignada
     * @return Verdadero si el academico fue añadido y falso si no fue añadido
     */
    static boolean nuevoAcademico (Map<Character, Academico> academia, Academico novo, Character letra) {
        letra = Character.toUpperCase(letra);
        if (academia!=null && Character.isLetter(letra)) {
            academia.put(letra,novo);
            return true;
        }
        return false;
    }
}
