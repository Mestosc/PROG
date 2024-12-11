import java.util.Scanner;

public class RexistroHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] hotel = new String[4][6];
        mostrarMenu(hotel,sc);
    }
    static void registrarUsuarios(String[][] hote,String cliente, int numeroPlanta, int numeroHabitacion) {
        if (hote[numeroPlanta][numeroHabitacion]!=null) {
            System.out.println("En esta habitacion ya hay un ocupante");
        }
        else {
            hote[numeroPlanta][numeroHabitacion] = cliente;
        }
    }
    static void dejarHabitacion(String[][] hote,int numeroPlanta,int numeroHabitacion) {
        if (hote[numeroPlanta][numeroHabitacion]!=null) {
        hote[numeroPlanta][numeroHabitacion] = null;
        }
        else {
            System.out.println("No puedes echar a nadie de una habitacion en la que no hay nadie");
        }
    }
    static void mostrarHabitaciones(String[][] hote) {
        for (int i = hote.length-1; i >= 0; i--) {
            System.out.print("Planta " + (i+1) + ": ");
            for (int j = 0; j < hote[i].length; j++) {
                if (hote[i][j]==null) {
                    System.out.print((i+1)+""+(j+1)+" Vacia ");
                }
                else {
                    System.out.print((i+1)+""+(j+1)+" " + hote[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    static void mostrarMenu(String[][] hote, Scanner sc) {
        int opcion;
        int numero,planta,habitacion;
       do {
           System.out.println("1.Registrar Usuarios\n2.Dejar Habitacion\n3.Habitacion vacia\n4.Salir");
           opcion = sc.nextInt();
           if (opcion==1) {
               System.out.println("Introduzca numero");
               numero = sc.nextInt();
               planta = (numero/10)-1;
               habitacion = (planta%10)-1;
               System.out.println("Inquilino a registrar");
               String cliente = sc.next();
               registrarUsuarios(hote,cliente,planta,habitacion);
           } else if (opcion==2) {
               System.out.println("Introduzca numero");
               numero = sc.nextInt();
               planta = (numero/10)-1;
               habitacion = (planta%10)-1;
               dejarHabitacion(hote,planta,habitacion);
           } else if (opcion == 3) {
               mostrarHabitaciones(hote);
           }
       } while (opcion<4);

    }

}
