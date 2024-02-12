import java.util.Scanner;
import java.util.stream.*;

class EncontraQuebraRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Classe de complexidade:
         * O(n)
         */

        String[] entrada = sc.nextLine().split(" ");
        sc.close();

        System.out.println(encontraQuebra(stringToArray(entrada), 0, 0));

    }

    private static int encontraQuebra(int[] inteiros, int indice, int comparador) {
        if (indice == 0) {
            comparador = inteiros[indice];
            return encontraQuebra(inteiros, indice + 1, comparador);
        } else if (indice > inteiros.length - 1) {
            return -1;
        } else if (comparador < inteiros[indice]) {
            comparador = inteiros[indice];
            return encontraQuebra(inteiros, indice + 1, comparador);
        } else {
            return indice;
        }

    }

    private static int[] stringToArray(String[] string) {
        return Stream.of(string).mapToInt(Integer::parseInt).toArray();
    }

}
