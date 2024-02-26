import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class InsereUltimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        sc.close();

        System.out.println(Arrays.toString(insereUltimo(stringToArrayInt(entrada))));

    }

    public static int[] insereUltimo(int[] inteiros) {
        int j = inteiros.length - 1;
        while (j > 0 && inteiros[j - 1] > inteiros[j]) {
            swap(inteiros, j - 1, j);
            j--;
        }
        return inteiros;
    }

    public static void swap(int[] inteiros, int i, int j) {
        int temp = inteiros[j];
        inteiros[j] = inteiros[i];
        inteiros[i] = temp;
    }

    private static int[] stringToArrayInt(String[] entrada) {
        return Stream.of(entrada).mapToInt(Integer::parseInt).toArray();
    }

}
