import java.util.Random;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int[] sorteados = new int[6];
        int[] jogador = new int[6];
        int acertos = 0;

        for (int i = 0; i < 6; i++) {
            sorteados[i] = rand.nextInt(60) + 1;
        }

        System.out.println("Digite 6 números:");
        for (int i = 0; i < 6; i++) {
            jogador[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (jogador[i] == sorteados[j]) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.print("Números sorteados: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(sorteados[i] + " ");
        }

        System.out.println("Você acertou " + acertos + " número");

        sc.close();
    }
}