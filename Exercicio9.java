import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite o número K: ");
        int k = sc.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * k;
        }

        System.out.print("Resultados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
