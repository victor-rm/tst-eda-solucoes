import java.util.Scanner;
import java.util.stream.Stream;

class TopN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Classe de complexidade:
         * o(n²)
         */

        String[] entrada = sc.nextLine().split(" ");
        int topN = sc.nextInt();
        sc.close();

        int[] arrayMaiores = new int[topN];

        int[] topElementos = maioresElementos(stringToArray(entrada), arrayMaiores);

        String saida = "";

        for (int i = 0; i < topElementos.length; i++) {
            saida += topElementos[i] + " ";
        }

        System.out.println(saida.trim());

    }

    private static int[] maioresElementos(int[] inteiros, int[] arrayMaiores) {
        int quantSwaps = 0;
        do {
            quantSwaps = 0;
            for (int i = 0; i < inteiros.length - 1; i++) {
                if (inteiros[i] < inteiros[i + 1]) {
                    int temp = inteiros[i + 1];
                    inteiros[i + 1] = inteiros[i];
                    inteiros[i] = temp;
                    quantSwaps++;
                }
            }

        } while (quantSwaps != 0);

        for (int i = 0; i < arrayMaiores.length; i++) {

            arrayMaiores[i] = inteiros[i];

        }

        return arrayMaiores;

    }

    private static int[] stringToArray(String[] stringArray) {
        return Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
    }

}
