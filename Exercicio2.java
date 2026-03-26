import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];

        System.out.println("Digite 20 números");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número: ");
            vetor[i] = sc.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) maior = vetor[i];
            if (vetor[i] < menor) menor = vetor[i];
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i]; 
        }
        double media = soma / vetor.length;

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        int moda = vetor[0];
        int maxFreq = 0;

        for (int i = 0; i < vetor.length; i++) {
            int freq = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == vetor[i]) {
                    freq++;
                }
            }
            if (freq > maxFreq) {
                maxFreq = freq;
                moda = vetor[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.printf("Média: ", media);
        System.out.println("Moda: " + moda);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);


        //Não lembro como faz Desvio Padrão
    }
}
