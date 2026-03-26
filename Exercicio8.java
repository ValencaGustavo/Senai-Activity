import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números :");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }
        boolean crescente = true;

        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                crescente = false;
                break;
            }
        }

        if (crescente) {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
