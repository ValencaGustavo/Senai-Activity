import java.util.Scanner;

public class Exercicio3 {

    static boolean ehPrimo(int n) {
        if (n < 2) return false; 

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; 
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Primos encontrados: ");
        boolean achouPrimo = false;

        for (int i = 0; i < vetor.length; i++) {
            if (ehPrimo(vetor[i])) {
                System.out.print(vetor[i] + " ");
                achouPrimo = true;
            }
        }

        if (!achouPrimo) {
            System.out.println("Thorfin!! Você não tem primos! Ninguém tem!");
        } else {
            System.out.println();
        }
    }
}
