import java.util.HashSet;
import java.util.Set;

public class Ejercicio7 {
    public static void main(String[] args) {
        Set<Integer> pr = new HashSet<>();
        pr.add(2);
        pr.add(20);
        pr.add(50);
        Set<Integer> pd = new HashSet<>();
        pd.add(40);
        pd.add(80);
        pd.add(1);
        Set<Integer> resutl = union(pr,pd);
        System.out.println(resutl);
    }
    static <E>Set<E> union (Set<E> conxunto1, Set<E> conxunto2) {
        Set<E> nuevo = new HashSet<>();
        nuevo.addAll(conxunto1);
        nuevo.addAll(conxunto2);
        return nuevo;
    }
}
