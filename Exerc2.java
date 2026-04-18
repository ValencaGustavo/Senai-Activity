import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[5][5];
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite um número: ");
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] < 0) {
                    negativos++;
                }
            }
        }

        System.out.println("Quantidade de números negativos: " + negativos);

        sc.close();
    }
}