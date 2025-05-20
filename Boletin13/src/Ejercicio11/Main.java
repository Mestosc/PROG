package Ejercicio11;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character,Academico> academia = new HashMap<>();
        Academico academico0 = new Academico("Abel del Sn",1999);
        Academico academico1 = new Academico("Ana de la rosa",2003);
        Academico academico2 = new Academico("Jorge de la piedra",2001);
        nuevoAcademico(academia,academico0,'Z');
        if (nuevoAcademico(academia,academico1,'S')) {
            System.out.println("Academico añadido");
        }
        nuevoAcademico(academia,academico2,'R');
        System.out.println(academia);
        List<Academico> academicos = new ArrayList<>(List.copyOf(academia.values()));
        System.out.println(academicos);
        Collections.sort(academicos, new Comparator<Academico>() {
            @Override
            public int compare(Academico academico, Academico t1) {
                int nomNum1 = (int) academico.nome.charAt(0) + academico.nome.charAt(1);
                int nomNum2 = (int) t1.nome.charAt(0) + t1.nome.charAt(1);
                int num1 = academico.anoIngreso + nomNum1;
                int num2 = t1.anoIngreso + nomNum2;
                return Integer.compare(num1,num2);
            }
        });
        System.out.println("Despues de aplicar el orden por nombre y años sin letras");
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
