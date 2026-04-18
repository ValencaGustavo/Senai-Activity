import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um número: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");

        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        sc.close();
    }
}