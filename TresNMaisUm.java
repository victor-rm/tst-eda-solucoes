import java.util.Scanner;

class TresNMaisUm {
    public static void main(String[] args) {
        /*
         * Complexidade n**2 devido a existência de um loop dentro de outro no código.
         */

        Scanner sc = new Scanner(System.in);

        int entrada1 = sc.nextInt();
        int entrada2 = sc.nextInt();
        sc.close();
        int maior_sequencia = 0;

        for (int i = entrada1; i <= entrada2; i++) {

            int sequencia = calcularTamanhoSequencia(i);

            if (sequencia > maior_sequencia) {
                maior_sequencia = sequencia;
            }

        }

        System.out.println(maior_sequencia);

    }

    private static int calcularTamanhoSequencia(int numero) {
        int tamanho = 1;
        while (numero != 1) {
            if (numero % 2 == 0) {
                numero /= 2;
            } else {
                numero = 3 * numero + 1;
            }
            tamanho++;
        }
        return tamanho;
    }
}
