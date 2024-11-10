public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[6]; // Estableciendo lista de numeros
        for (int j = 0;j<numeros.length;j++) {
            numeros[j] = (int)Math.floor(Math.random()*51); // Añadiendo numeros aleatorios entre el 1 y el 50 ambos incluidos a cada espacio del array
        }
        for (int i = numeros.length-1;i>0;i--){ /* Hacer un bucle for
        para iterar de forma inversa los numeros
        */
            System.out.println(numeros[i]); //Mostrar cada uno de los numeros de la lista
        }
    }
}
