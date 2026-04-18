import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz1[][] = new int[2][3];
        int matriz2[][] = new int[3][2];
        int resultado[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz 1 - Digite um número: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz 2 - Digite um número: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Resultado da multiplicação:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}