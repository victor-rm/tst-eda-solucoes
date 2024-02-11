import java.util.Scanner;

class EncontraPrimeiroNegativo {

    public static void main(String[] args) {
        /**
         * Classe de complexidade:
         * Tendo em vista que ocorre um loop através da recursividade esse código escala de forma linear (n).
         */
        Scanner sc = new Scanner(System.in);
        sc.close();

        String[] elementos = sc.nextLine().split(" ");

        System.out.println(primeiroNegativo(elementos, 0));

    }

    private static String primeiroNegativo(String[] elementos, int indice) {
        if (Integer.parseInt(elementos[indice]) < 0) {
            return elementos[indice];
        } else {
            if (indice < elementos.length - 1) {
                return primeiroNegativo(elementos, indice + 1);
            } else {
                return "-";
            }
        }
    }
}
