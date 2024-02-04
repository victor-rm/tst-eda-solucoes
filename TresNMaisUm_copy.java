import java.util.Scanner;

class TresNMaisUm_copy {
    public static void main(String[] args) {
        /*
         * Outra forma de resolver essa questão, um pouco mais poluído, fiz para provar um ponto. 
         */

        Scanner sc = new Scanner(System.in);

        int entrada1 = sc.nextInt();
        int entrada2 = sc.nextInt();
        sc.close();
        int maior_sequencia = 0;

        for (int i = entrada1; i <= entrada2; i++) {
            int numero = i;
            int sequencia = 1;
            while (numero != 1) {
                if (numero % 2 == 0) {
                    numero /= 2;
                } else {
                    numero = 3 * numero + 1;
                }
                sequencia++;
            }

            if (sequencia > maior_sequencia) {
                maior_sequencia = sequencia;
            }

        }

        System.out.println(maior_sequencia);

    }

}
