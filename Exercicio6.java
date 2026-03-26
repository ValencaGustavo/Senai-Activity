import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                positivos++;
            } else if (vetor[i] < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros:     " + zeros);
    }
}
