import java.util.Scanner;

class FrequenciaElemento {
    public static void main(String[] args) {
        /*
         * Esse código possui uma complexidade linear, pois no pior caso ele será
         * executado
         * n + 1 vezes, sendo n o tamanho do array
         */
        Scanner sc = new Scanner(System.in);

        // Entrada referente ao número a ser procurado
        int numero_procurado = Integer.parseInt(sc.nextLine());

        // Segunda entrada, sequência de inteiros a serem observados
        String[] inteiros = sc.nextLine().split(" ");

        sc.close();

        int frequencia = 0;

        // Verificação do numero a ser procurado na sequencia de inteiros
        // disponibilizada.
        for (int i = 0; i < inteiros.length; i++) {
            if (Integer.parseInt(inteiros[i]) == numero_procurado) {
                frequencia++;
            }
        }
        System.out.println(frequencia);
    }
}
