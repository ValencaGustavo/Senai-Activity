import java.util.Scanner;

// ============================================================
// UNISENAI - 3º Período - Engenharia de Software
// Exercício 10 - Palíndromo?
// ============================================================
// Um palíndromo lê igual da esquerda para a direita e vice-versa.
// Exemplos:
//   [1, 2, 3, 2, 1] → SIM (palíndromo)
//   [1, 2, 3, 4, 5] → NÃO
//
// Estratégia: comparar vetor[0] com vetor[n-1],
//             vetor[1] com vetor[n-2], etc.
// Percorremos só até a metade para não comparar duas vezes.
// ============================================================

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        System.out.println("Digite os " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        boolean palindromo = true;

        for (int i = 0; i < n / 2; i++) {
            // Compara o elemento da esquerda com o espelho da direita
            if (vetor[i] != vetor[n - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
