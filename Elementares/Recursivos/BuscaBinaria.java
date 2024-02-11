import java.util.Scanner;
import java.util.stream.Stream;

class BuscaBinaria {
    public static void main(String[] args) {
        /*
         * Classe de complexidade:
         * o(log(n)): O tempo cresce de forma logaritmica em função da entrada.
         * É log(n) pois o código analisa a metade da entrada a cada iteração.
         */

        Scanner sc = new Scanner(System.in);

        String[] sequencia = sc.nextLine().split(" ");
        int[] inteiros = StringArrayToIntArray(sequencia);
        int chave = sc.nextInt();
        sc.close();

        System.out.println(buscaLinear(inteiros, 0, sequencia.length - 1, chave));
    }

    private static int buscaLinear(int[] inteiros, int ini, int fim, int chave) {
        int meio = (fim + ini) / 2;
        if ((meio == 0 || meio == inteiros.length - 1) && inteiros[meio] != chave) {
            System.out.println(meio);
            return -1;
        }
        if (chave == inteiros[meio]) {
            return meio;
        }
        if (inteiros[meio] > chave) {
            System.out.println(meio);
            return buscaLinear(inteiros, ini, meio -1, chave);
        } else {
            System.out.println(meio);
            return buscaLinear(inteiros, meio + 1, fim, chave);
        }
    }

    private static int[] StringArrayToIntArray(String[] stringArray) {
        return Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
    }
}
