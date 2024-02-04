import java.util.Scanner;


class ElementosDuplicados {
    public static void main(String[] args) {
        
        // Complexidade quadrática (n**2), pois o algoritmo utiliza 2 loops
        
        Scanner sc = new Scanner(System.in);

        // Entrada responsável por receber os elementos.
        String[] elementos = sc.nextLine().split(" ");

        sc.close();

        boolean temDuplicado = false;

        // Loops para verificar se existem elementos duplicados
        for (int i = 0; i < elementos.length; i++) {
            for (int j = i + 1; j < elementos.length; j++) {
                if (elementos[i].equals(elementos[j])) {
                    temDuplicado = true;
                }
            }
        }

        System.out.println(temDuplicado);
    }

}
