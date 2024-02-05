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
        int resto = fator - elementos.length;
        int limite = fator - elementos.length;
        String vetor = "";
        for(int i = 0; i < resto && limite != 0; i++) {
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

/* 
    esse código não funciona para todos os casos, está aqui para fins de lembrança e compreensão
    private static String circularAntigo(String[] elementos, int fator) {
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
*/