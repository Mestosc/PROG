public class ejercicio4 {
    public static void main(String[] args){
        boolean primera = true && true == false;
        System.out.println(primera);
        boolean segunda = false == true;
        System.out.println(segunda);
        boolean tercero = (true && true) || false == true;
        System.out.println(tercero);
        boolean cuarto = (!(true&&false)) == false;
        System.out.println(cuarto);
        boolean quinto = "12" + "12" == "24";
        System.out.println(quinto);
        boolean sexto = "12" + "12" == "24";
        System.out.println(sexto);
        boolean septimo = "34" + "43" == "3443";
        System.out.println(septimo);
    }
}
