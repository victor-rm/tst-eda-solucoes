import java.util.Scanner;
import java.util.stream.Stream;

class EncontraElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Classe de complexidade:
         * O(n)
         */

        int elemento = sc.nextInt();
        sc.nextLine();
        String[] inteiros = sc.nextLine().split(" ");
        sc.close();

        System.out.println(encontraElemento(stringToArray(inteiros), elemento));

    }

    private static String encontraElemento(int[] inteiros, int elemento) {
        String encontrou = "nao";
        for (int i = 0; i < inteiros.length; i++) {
            if (elemento == inteiros[i]) {
                encontrou = "sim";
                break;
            }
        }
        return encontrou;
    }

    private static int[] stringToArray(String[] stringArray) {
        return Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
    }

}
