import java.util.Scanner;
import java.util.stream.Stream;

class BuscaLinearRecursiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        int numero = sc.nextInt();

        sc.close();

        int[] inteiros = stringArrayToIntArray(entrada);

        System.out.println(buscaLinear(inteiros, 0, inteiros.length, numero));

    }

    private static int buscaLinear(int[] inteiros, int ini, int fim, int chave) {
        if (ini < fim) {
            if (inteiros[ini] != chave) {
                return buscaLinear(inteiros, ini + 1, fim, chave);
            } else {
                return ini;
            }
        }else {
            return -1;
        }
    }

    private static int[] stringArrayToIntArray(String[] stringArray) {
        return Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
    }

}
