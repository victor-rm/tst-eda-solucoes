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

        if (fatorcircular < elementos.length) {
            for (int i = 0; i < elementos.length - fatorcircular; i++) {
                saida += elementos[i] + " ";
            }
            System.out.println(saida.trim());

        } else {
            for (int i = 0; i < elementos.length; i++) {
                saida += elementos[i] + " ";
            }
            System.out.println(saida + circular(elementos, fatorcircular).trim());
        }

    }

    private static String circular(String[] elementos, int fator) {
        int resto = fator - elementos.length;
        int limite = fator - elementos.length;
        String vetor = "";
        for (int i = 0; i < resto && limite != 0; i++) {
            if (i == elementos.length) {
                i = 0;
                vetor += elementos[i] + " ";
                limite--;
            } else {
                vetor += elementos[i] + " ";
                limite--;
            }
        }
        return vetor;
    }
}
