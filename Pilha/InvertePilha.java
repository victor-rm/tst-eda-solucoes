import java.util.Scanner;
import java.util.stream.Stream;

class InvertePilha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoPilha = sc.nextInt();
        sc.nextLine();
        String[] entrada = sc.nextLine().split(" ");
        sc.close();

        int[] inteiros = stringToArrayInt(entrada);

        Pilha pilha = new Pilha(tamanhoPilha);
        Pilha pilhaInvertida = new Pilha(tamanhoPilha);

        // Adiciona elementos da entrada na pilha de entrada
        for (int i = 0; i < inteiros.length; i++) {
            pilha.push(inteiros[i]);
        }

        // Retira o valor de cima da pilha de entrada e coloca-o na pilha invertida
        for (int i = 0; i < inteiros.length; i++) {
            pilhaInvertida.push(pilha.peek());
            pilha.pop();
        }

        // Imprime o valor do topo da pilha invertida e executa o método pop 
        for (int i = 0; i < inteiros.length; i++) {
            System.out.println(pilhaInvertida.peek());
            pilhaInvertida.pop();
        }

    }

    private static int[] stringToArrayInt(String[] entrada) {
        return Stream.of(entrada).mapToInt(Integer::parseInt).toArray();
    }

}