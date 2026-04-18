import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double matriz[][] = new double[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um número: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Média das linhas:");

        for (int i = 0; i < 3; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += matriz[i][j];
            }
            System.out.println(soma / 4);
        }

        System.out.println("Média das colunas:");

        for (int j = 0; j < 4; j++) {
            double soma = 0;
            for (int i = 0; i < 3; i++) {
                soma += matriz[i][j];
            }
            System.out.println(soma / 3);
        }

        sc.close();
    }
}