import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        System.out.println("Digite os " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Vetor original:  ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n / 2; i++) {
            int temp = vetor[i];         
            vetor[i] = vetor[n - 1 - i];  
            vetor[n - 1 - i] = temp;       
        }

        System.out.print("Vetor invertido: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }
}
