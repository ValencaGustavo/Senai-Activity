import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }

        int P = sc.nextInt();

        for (int i = P; i < 9; i++) {
            vetor[i] = vetor[i + 1];
        }

        for (int i = 0; i < 9; i++) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}