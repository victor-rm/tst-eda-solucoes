import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class SelectionPassoAPasso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        sc.close();

        selectionSort(stringToArrayInt(entrada));

    }

    private static void selectionSort(int[] inteiros) {
        int indexMenor = 0;
        for (int i = 0; i < inteiros.length; i++) {
            for (int j = i + 1; j < inteiros.length; j++) {
                if (inteiros[indexMenor] > inteiros[j]) {
                    indexMenor = j;
                }
            }
            if (indexMenor != i) {
                swap(inteiros, i, indexMenor);
                System.out.println(Arrays.toString(inteiros));
            }
        }

    }

    private static void swap(int[] inteiros, int i, int j) {
        int temp = inteiros[j];
        inteiros[j] = inteiros[i];
        inteiros[i] = temp;
    }

    private static int[] stringToArrayInt(String[] entrada) {
        return Stream.of(entrada).mapToInt(Integer::parseInt).toArray();
    }

}