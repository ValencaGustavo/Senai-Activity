import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[15];
        int[] noRepeticao = new int[15];
        int total = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            boolean repetido = false;

            for (int j = 0; j < total; j++) {
                if (vetor[i] == noRepeticao[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                noRepeticao[total] = vetor[i];
                total++;
            }
        }

        System.out.print("Sem repetição: ");
        for (int i = 0; i < total; i++) {
            System.out.print(noRepeticao[i] + " ");
        }

        System.out.println("Total: " + total);
    }
}
