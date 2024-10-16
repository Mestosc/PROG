public class ejercicio5 {
    public static void main(String[] args) {
        int i,j,k;
        double rede;
        double tipo;
        int ano;
        int a,b,c,d;
        // Primera expresion
        i = 1;
        j = 0;
        k = 1;
        boolean resultadoA = i + k <= j -k * 3 && k >= 2;
        System.out.println(resultadoA);
        // Segunda operacion
        i = 3;
        j = 2;
        k = -1;
        boolean resultadoB = i == 3 || j <= 2 && k > 0;
        System.out.println(resultadoB);
        // Tercera operacion
        rede = 7.5;
        tipo = 10.00;
        boolean resultadoC = tipo < rede + 1.5;
        System.out.println(resultadoC);
        //Cuarta operacion
        ano = 1993;
        boolean resultadoD = ano % 400 == 0;
        System.out.println(resultadoD);
        // Quinta operacion
        boolean resultadoE = 3 == 2 || 5 > 1 + 1;
        System.out.println(resultadoE);
        //Sexta operacion
        boolean resultadoF = 5 - 2 > 4 && !(0.5 == 1/5);
        System.out.println(resultadoF);
        //Septima operacion
        a = 2;
        b = 5;
        c = 6;
        d = 10;
        boolean resultadoG = a >= b || a >= c && a <d;
        System.out.println(resultadoG);
        // Octava operacion
        a = 2;
        b = 5;
        c = 6;
        d = 10;
        boolean resultadoH = a + b < c && a + c < d || 2 * a < a + b;
        System.out.println(resultadoH);
        //Novena operacion
        a = 2;
        b = 5;
        c = 6;
        d = 10;
        boolean resultadoI = !(a * b < d) && !(a * b < c) || b + c <= d;
        System.out.println(resultadoI);
    }
}
