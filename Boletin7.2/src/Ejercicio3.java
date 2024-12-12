public class Ejercicio3 {
    public static void main(String[] args) {
        String[][] menu = {{"Primero","Segundo","Postre"},
                            {"Arroz","Huevos fritos","Natilla de chocolate"}};
        crearPedido(1);
    }
    static void mostrarMenu(String[][] menu) {
        for (String[] men : menu) {
            for (String me : men) {
                System.out.println(me);
            }
        }
    }
    static String[][] crearPedido(int pedido) {
        String[][] orden = new String[0][0];
        switch (pedido) {
            case 1-> orden = new String[][]{{"Primero","Segundo","Postre"},{"Arroz","Huevos fritos","Tarta de fresa"}};
            case 2 -> orden = new String[][]{{"Primero","Segundo","Postre"},{"Sopa","Patatas","Tarta de mango"}};
            case 3-> orden = new String[][]{{"Primero","Segundo","Postre"},{"Sopa de pollo","Huevos cocidos","Tarta de queso"}};
        }
        return orden;
    }
}
