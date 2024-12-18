public class Ejercicio10 {
    public static void main(String[] args) {
        String tex = " ABCD";
        tex = tex.replace("B","S").replace("D","I");
        tex = tex.concat("I");
        System.out.println(tex);
    }
}
