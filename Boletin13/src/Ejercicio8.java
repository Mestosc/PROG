import java.util.HashSet;
import java.util.Set;

public class Ejercicio8 {
    public static void main(String[] args) {
        Set<Integer> pr = new HashSet<>();
        pr.add(2);
        pr.add(20);
        pr.add(50);
        Set<Integer> pe = new HashSet<>();
        pe.add(20);
        pe.add(50);
        pe.add(1);
        Set<Integer> resutl = interseccion(pr,pe);
        System.out.println(resutl);
    }
    static <E> Set <E> interseccion (Set<E> conxunto1, Set<E> conxunto2) {
        Set<E> resultado = new HashSet<>(conxunto1);
        resultado.retainAll(conxunto2);
        return resultado;
    }
}
