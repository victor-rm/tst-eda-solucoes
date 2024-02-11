import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        /*
         * Classe de complexidade:
         * O(n)
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}