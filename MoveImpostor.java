import java.util.Arrays;
import java.util.Scanner;

class MoveImpostor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inteiros = sc.nextLine().split(" ");
        sc.close();

        for (int i = 0; i < inteiros.length - 1; i++) {
            if (Integer.parseInt(inteiros[i]) > Integer.parseInt(inteiros[i + 1])) {
                while (i >= 0 && Integer.parseInt(inteiros[i]) > Integer.parseInt(inteiros[i + 1])) {
                    String temp = inteiros[i];
                    inteiros[i] = inteiros[i + 1];
                    inteiros[i + 1] = temp;
                    i--;

                }
                break;
            }
        }

        String saida = Arrays.toString(inteiros);

        System.out.println(saida);

    }

}
