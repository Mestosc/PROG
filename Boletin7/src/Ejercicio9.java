import static java.util.Arrays.binarySearch;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] lsi = {1,4,6,8,1,6,8};
        for (int num:LocalizarRepeticion(lsi)) {
            System.out.println(num);
        }

    }
    static int[] LocalizarRepeticion(int[]lista) {
        int[] temp = new int[0];
        for (int num:lista) {
            if (binarySearch(temp,num)<0) {
                System.out.println("Repetido: " + num);
                int[] novo = new int [temp.length+1];
                for (int i = 0;i<temp.length;i++) {
                    novo[i] = temp[i];
                }
                novo[temp.length] = num;
                temp = novo;
            }

        }
        return temp;

    }
}
