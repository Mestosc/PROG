public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {23,12,54,67,8,9,10};
        for (int numero : numerosPares(numeros)) {
            System.out.println(numero);
        }
    }
    static int[] numerosPares(int[] lista) {
        int cuenta=0;
        for (int j : lista) {
            if (j % 2 == 0) {
                cuenta += 1;
            }
        }
        int[] pares = new int[cuenta];
        int saberPares;
        for (int i = 0;i<lista.length;i++) {
            if (lista[i]%2==0) {
                for (int j = 0;j<pares.length;j++) {
                    pares[j] = lista[i];
                }
            }
        }
        return pares;
    }
}
