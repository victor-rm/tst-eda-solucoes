import java.util.Scanner;

class VetorCircular {
    public static void main(String[] args) {
        /**
         * Classificação da complexidade:
         * Esse código tem complexidade linear
         */
        Scanner sc = new Scanner(System.in);

        String[] elementos = sc.nextLine().split(" ");
        int fatorcircular = Integer.parseInt(sc.nextLine());
        sc.close();

        String saida = "";

        for (int i = 0; i < elementos.length; i++) {
            saida += elementos[i] + " ";
        }
        System.out.println(saida + circular(elementos, fatorcircular).trim());

    }

    private static String circular(String[] elementos, int fator) {
        String vetor = "";
        for (int i = 0; i < elementos.length && fator - elementos.length >= elementos.length; i++) {
            if (i == elementos.length - 1) {
                fator--;
                if (fator - elementos.length == elementos.length) {
                    break;
                }
                vetor += elementos[i] + " ";
                i = -1;
            } else {
                vetor += elementos[i] + " ";
            }
        }
        return vetor;
    }
}
