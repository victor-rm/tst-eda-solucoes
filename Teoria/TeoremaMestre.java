import java.util.Scanner;

class TeoremaMestre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        sc.close();

        int a = Integer.parseInt(entrada[0]);
        int b = Integer.parseInt(entrada[1]);
        int c = Integer.parseInt(entrada[2]);
        
        int log = (int) (Math.log(a)/Math.log(b));

        if (log < c) {
            System.out.printf("T(n) = theta(n**%d)\n", c);
        } else if (log == c) {
            System.out.printf("T(n) = theta(n**%d * log n)\n", log);
        } else {
            System.out.printf("T(n) = theta(n**%d * log n)\n", log);
        }
    }

}
