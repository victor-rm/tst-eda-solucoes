import java.util.Scanner;

class WarmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Primeira entrada, responsável por multiplicar a sequência de números
        int multiplicador = Integer.parseInt(sc.nextLine()); 
        
        // Segunda entrada, números a serem multiplicados
        String[] numeros = sc.nextLine().split(" ");

        sc.close();

        String resultado = "";

        for(int i = 0; i < numeros.length; i++) {
            resultado += Integer.toString(Integer.parseInt(numeros[i]) * multiplicador) + " ";
        }

        System.out.println(resultado.trim());
    }
}