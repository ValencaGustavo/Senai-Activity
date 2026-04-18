import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        boolean simetrica = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
            }
        }

        if (simetrica) {
            System.out.println("A matriz é simétrica");
        } else {
            System.out.println("A matriz não é simétrica");
        }

        sc.close();
    }
}