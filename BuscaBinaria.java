// A fazer
import java.util.Scanner;
import java.util.stream.Stream;

class BuscaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sequencia = sc.nextLine().split(" ");
        int[] inteiros = StringArrayToIntArray(sequencia);
        int chave = sc.nextInt();
        sc.close();

        System.out.println(buscaLinear(inteiros, 0, sequencia.length - 1, chave));
    }

    public static int buscaLinear(int[] inteiros, int ini, int fim, int chave) {
        int meio = (fim + ini) / 2;
        System.out.println(meio);
        if ((meio == 0 || meio == inteiros.length - 1) && inteiros[meio] != chave) {
            return -1;
        }
        if (chave == inteiros[meio]) {
            return meio;
        }
        if (inteiros[meio] > chave) {
            return buscaLinear(inteiros, ini, meio -1, chave);
        } else {
            return buscaLinear(inteiros, meio + 1, fim, chave);
        }
    }

    public static int[] StringArrayToIntArray(String[] stringArray) {
        return Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
    }
}
