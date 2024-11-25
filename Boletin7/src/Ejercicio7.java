public class Ejercicio7 {
    public static void main(String[] args) {
        int[] matriz = {12,134,145,164,67,54,13,778,54,32};
        int[] matrizP = CopiaMatriz(matriz);
        System.out.println("Comienza la matriz original");
        for (int matriz1 : matriz) {
            System.out.println(matriz1);
        }
        System.out.println("Finaliza la original");
        for (int matriz1 : matrizP) {
            System.out.println(matriz1);
        }
        System.out.println("Finaliza la matriz copia");

    }
    static int[] CopiaMatriz(int[] matriz) {
        int[] nuevaMatriz = new int [matriz.length];
        for (int i = 0; i<nuevaMatriz.length;i++) {
            nuevaMatriz[i] = matriz[i];
        }
        return nuevaMatriz;
    }
}
