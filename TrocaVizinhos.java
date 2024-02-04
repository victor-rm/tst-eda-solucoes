import java.util.Scanner;
import java.util.Arrays;

class TrocaVizinhos {
    public static void main(String[] args) {
        /*
         * Classe de complexidade:
         * Esse código possui uma complexidade linear.
         */
        Scanner sc = new Scanner(System.in);

        String[] sequencia = sc.nextLine().split(" ");

        sc.close();

        for (int i = 0; i < sequencia.length - 1; i++) {
            String temp = sequencia[i];

            sequencia[i] = sequencia[i + 1];
            sequencia[i + 1] = temp;
            i++;
        }

        String sequencia_formatada = Arrays.toString(sequencia);
        System.out.println(sequencia_formatada);

    }
}
