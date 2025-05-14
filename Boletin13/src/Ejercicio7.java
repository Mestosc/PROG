import java.util.HashSet;
import java.util.Set;

public class Ejercicio7 {
    public static void main(String[] args) {

    }
    static <E> Set <E> union (Set<E> conxunto1, Set<E> conxunto2) {
        Set<E> nuevo = new HashSet<>();
        nuevo.addAll(conxunto1);
        nuevo.addAll(conxunto2);
        return nuevo;
    }
}
