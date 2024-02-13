import java.util.Scanner;
import java.util.stream.Stream;

class SemPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Classe de complexidade:
         * O(n²)
         */

        String[] entrada = sc.nextLine().split(" ");
        sc.close();

        System.out.println(semPar(stringToArrayInt(entrada)));

    }

    private static int semPar(int[] inteiros) {
        int contadorElemento = 0;
        int elemento = -1;
        for (int i = 0; i < inteiros.length; i++) {
            contadorElemento = 0;
            for (int j = 0; j < inteiros.length; j++) {
                if (inteiros[i] == inteiros[j]) {
                    contadorElemento++;
                }
            }
            if (contadorElemento == 1) {
                elemento = inteiros[i];
            }
        }
        return elemento;

    }

    private static int[] stringToArrayInt(String[] stringArray) {
        return Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
    }

}
