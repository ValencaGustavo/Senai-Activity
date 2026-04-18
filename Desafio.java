import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];
        char jogador = 'X';
        int jogadas = 0;
        boolean venceu = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        while (jogadas < 9 && !venceu) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Jogador " + jogador);

            System.out.print("Linha (0 a 2): ");
            int linha = sc.nextInt();

            System.out.print("Coluna (0 a 2): ");
            int coluna = sc.nextInt();

            if (tabuleiro[linha][coluna] != '-') {
                System.out.println("Posição já ocupada!");
                continue;
            }

            tabuleiro[linha][coluna] = jogador;
            jogadas++;

            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                    venceu = true;
                }
                if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                    venceu = true;
                }
            }

            if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
                venceu = true;
            }

            if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
                venceu = true;
            }

            if (venceu) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tabuleiro[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Jogador " + jogador + " venceu!");
            } else {
                if (jogador == 'X') {
                    jogador = 'O';
                } else {
                    jogador = 'X';
                }
            }
        }

        if (!venceu) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Deu velha!");
        }

        sc.close();
    }
}