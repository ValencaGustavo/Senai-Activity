import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("\nQual numero deseja buscar: ");
        int x = sc.nextInt();

        boolean encontrado = false;

        System.out.print("O número " + x + " aparece na posilção: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println();
        } else {
            System.out.println("\nO número " + x + " não está no vetor");
        }
    }
}
