import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class InsertionSortRecursivo {
    public static void main(String[] args) {

        /*
         * O Insertion sort consiste em fazer a inserção ordenada(processo que os
         * códigos acima fizeram) "n" vezes. O que permite essa repetição da inserção
         * ordenada é começar a comparação com os itens anteriores a partir da segunda
         * posição no array. Isso permite o uso da inserção ordenada já na primeira
         * chamada do algoritmo.
         */

        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        sc.close();

        int[] inteiros = stringToArrayInt(entrada);

        insertionRecursivo(inteiros, 0);

    }

    private static int[] insertionRecursivo(int[] inteiros, int i) {
        if (inteiros.length < 2) {
            System.out.println(Arrays.toString(inteiros));
            return inteiros;
        }

        insercaoOrdenadaRecursiva(inteiros, i);
        if (i < inteiros.length - 1) {
            if (i != 0) {
                System.out.println(Arrays.toString(inteiros));
            }
            return insertionRecursivo(inteiros, i + 1);
        } else {
            System.out.println(Arrays.toString(inteiros));
            return inteiros;
        }

    }

    private static int[] insercaoOrdenadaRecursiva(int[] inteiros, int j) {
        if (j > 0 && inteiros[j] < inteiros[j - 1]) {
            swap(inteiros, j, j - 1);
            return insercaoOrdenadaRecursiva(inteiros, j - 1);
        }
        return inteiros;
    }

    private static void swap(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    private static int[] stringToArrayInt(String[] entrada) {
        return Stream.of(entrada).mapToInt(Integer::parseInt).toArray();
    }

}
