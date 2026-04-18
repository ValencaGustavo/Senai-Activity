import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double matriz[][] = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Matriz transposta:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}