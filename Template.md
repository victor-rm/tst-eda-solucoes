import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class InserePrimeiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        sc.close();

        System.out.println(Arrays.toString("funcao"(stringToArrayInt(entrada))));

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