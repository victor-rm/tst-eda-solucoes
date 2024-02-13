import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class MoveTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Classe de complexidade:
         * O(n²)
         */

        String[] entrada = sc.nextLine().split(" ");
        sc.close();

        moveTres(stringToArrayInt(entrada));

    }

    private static void moveTres(int[] inteiros) {
        for (int i = 0; i < inteiros.length - 1; i++) {
            if (inteiros[i] > inteiros[i + 1]) {
                for (int j = i + 1; j > 0; j--) {
                    if (inteiros[j] < inteiros[j - 1]) {
                        int temp = inteiros[j];
                        inteiros[j] = inteiros[j - 1];
                        inteiros[j - 1] = temp;
                        System.out.println(Arrays.toString(inteiros));
                    }
                }
            }
        }
    }

    private static int[] stringToArrayInt(String[] stringArray) {
        return Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
    }

}
