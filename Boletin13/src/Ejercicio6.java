import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ejercicio6 {
    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();
        anadirNumeros(integers);
        //eliminarNums(integers);
        eliminarNum2(integers);
        System.out.println(integers);
    }
    public static void eliminarNum2(Collection<Integer> c) {
        Iterator<Integer> it = c.iterator();
        int n;
        while (it.hasNext()) {
            n = it.next();
            if (n==5 || n==7) it.remove();
        }
    }
    public static void anadirNumeros(Collection<Integer> c) {
        for (int i = 0; i < 100; i++) {
            c.add((int) Math.floor(Math.random() * 10 + 1));
        }
    }
    public static void eliminarNums(Collection<Integer> c) {
        Collection<Integer> integers1 = new ArrayList<>();
        integers1.add(5);
        integers1.add(7);
        c.removeAll(integers1);
    }

}
