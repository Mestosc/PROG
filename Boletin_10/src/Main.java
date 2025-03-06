public class Main {
    public static void main(String[] args) {
        PlazaGaraje prazaGarciaB = new PlazaGaraje("Garcia Barbon","Venta" ,100,"Vigo",12);
        Vivienda vivienda = new Vivienda("Garcia Barbon","Venta",1200,"Vigo",12,"4C","3B",prazaGarciaB);
        System.out.println(vivienda);
    }
}