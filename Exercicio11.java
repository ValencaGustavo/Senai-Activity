import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }

        int contador = 0;

        for (int i = 0; i < 10; i++) {
            if (vetor[i] >= A && vetor[i] <= B) {
                contador++;
            }
        }

        System.out.println(contador);

        sc.close();
    }
}