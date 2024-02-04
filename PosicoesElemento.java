import java.util.Scanner;

class PosicoesElemento {
    public static void main(String[] args) {
        /*
         * Classe de complexidade:
         * Esse código possui uma complexidade linear, pois como há a existência
         * de um loop a entrada será lida em um tempo determinado por seu tamanho.
         */

        Scanner sc = new Scanner(System.in);

        String elemento = sc.nextLine();
        String[] sequencia_inteiros = sc.nextLine().split(" ");

        sc.close();

        String posicoes = "";

        for (int i = 0; i < sequencia_inteiros.length; i++) {
            if (sequencia_inteiros[i].equals(elemento)) {
                posicoes += i + " ";
            }

        }

        if (posicoes.equals("")) {
            System.out.println("-1");
        } else {
            System.out.println(posicoes.trim());
        }
    }

}
