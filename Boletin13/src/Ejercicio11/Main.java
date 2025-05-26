
package Ejercicio11;

import java.util.*;

import Ejercicio11.Academico;

public class Main {
    public static void main(String[] args) {
        Map<Character,Academico> academia = new HashMap<>();
        Academico academico0 = new Academico("Abel del Sn",2012);
        Academico academico1 = new Academico("Ana de la rosa",2000);
        Academico academico2 = new Academico("Jorge de la piedra",2001);
        nuevoAcademico(academia,academico0,'Z');
        if (nuevoAcademico(academia,academico1,'S')) {
            System.out.println("Academico añadido");
        }
        nuevoAcademico(academia,academico2,'R');
        System.out.println(academia);
        List<Academico> academicos = new ArrayList<>(List.copyOf(academia.values()));
	List<Map.Entry<Character, Academico>> academicosOrdenLetra = new ArrayList<>(academia.entrySet());
	academicosOrdenLetra.sort(new Comparator<Map.Entry<Character,Academico>>() {
        @Override
        public int compare(Map.Entry<Character, Academico> characterAcademicoEntry, Map.Entry<Character, Academico> t1) {
            int letraPA = (int) characterAcademicoEntry.getKey();
            int nombreFechaPA = obtenerNumeroNombre(characterAcademicoEntry.getValue().nome) + characterAcademicoEntry.getValue().anoIngreso;
            int letraT1 = (int) t1.getKey();
            int PA = letraPA + nombreFechaPA;
            int nombreFechaT1 = obtenerNumeroNombre(t1.getValue().nome) + t1.getValue().anoIngreso;
            int resultT1 = letraT1 + nombreFechaT1;
            return Integer.compare(PA,resultT1);
        }
    });
        System.out.println(academicos);
        academicos.sort(new Comparator<Academico>() {
            @Override
            public int compare(Academico academico, Academico t1) {
                int nomNum1 = obtenerNumeroNombre(academico.nome);
                int nomNum2 = obtenerNumeroNombre(t1.nome);
                int num1 = academico.anoIngreso + nomNum1;
                int num2 = t1.anoIngreso + nomNum2;
                return Integer.compare(num1, num2);
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
    static private int obtenerNumeroNombre(String nombre) {
        int numNombre = 0;
        if (nombre!=null) {
            nombre = nombre.strip().trim();
            for (int i = 0; i < nombre.length(); i++) {
                if (Character.isWhitespace(nombre.charAt(i))) continue;
                numNombre += (int) nombre.charAt(i);
            }
        }
        return numNombre;
    }
}
