import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class MoveN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Classe de complexidade:
         * O(n²)
         */

        String[] entrada = sc.nextLine().split(" ");
        sc.close();

        moveN(stringToArrayInt(entrada));

    }
// Preciso implementar outro algortimo de sort
    private static void moveN(int[] inteiros) {
        int numeroSwaps = 0;
        do {
            numeroSwaps = 0;
            for (int i = 0; i < inteiros.length - 1; i++) {
                if (inteiros[i] > inteiros[i + 1]) {
                    int temp = inteiros[i];
                    inteiros[i] = inteiros[i + 1];
                    inteiros[i + 1] = temp;
                    System.out.println(Arrays.toString(inteiros));
                    numeroSwaps++;
                }
            }
        } while (numeroSwaps != 0);

    }

    private static int[] stringToArrayInt(String[] stringArray) {
        return Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
    }

}
