import java.util.Scanner;

class PotenciaRecursiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Classe de complexidade:
         *  O(n)
         */

        int i = sc.nextInt();
        int j = sc.nextInt();

        sc.close();

        System.out.println(potenciaRecursiva(i, j));
    }

    private static int potenciaRecursiva(int i, int j) {
        if (j == 0) {
            return 1;
        } else {
            return i * potenciaRecursiva(i, j-1);
        }
    }
}
