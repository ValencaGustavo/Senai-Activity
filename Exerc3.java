import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz1[][] = new int[4][4];
        int matriz2[][] = new int[4][4];
        int soma[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz 1 - Digite um número: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz 2 - Digite um número: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Resultado da soma:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}