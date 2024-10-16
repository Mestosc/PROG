import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double B100, B50, B20, B10, B5, M1;
        Scanner dinero;
        dinero = new Scanner(System.in);
        System.out.print("Dime la cantidad de billetes de 100€:");
        B100 = dinero.nextDouble();
        System.out.print("Dime la cantidad de billetes de 50€:");
        B50 = dinero.nextDouble();
        System.out.print("Dime la cantidad de billetes de 20€:");
        B20 = dinero.nextDouble();
        System.out.print("Dime la cantidad de billetes de 10€:");
        B10 = dinero.nextDouble();
        System.out.print("Dime la cantidad de billetes de 5€:");
        B5 = dinero.nextDouble();
        System.out.print("Dime la cantidad de monedas de 1€:");
        M1 = dinero.nextDouble();
        System.out.print("La cantidad total de dinero es: " + ((B100*100)+(B50*50)+(B20*20)+(B10*10)+(B5*5)+M1));

    }
    }
