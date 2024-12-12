package advanced1;

import java.util.Scanner;

public class ChefAndSecretIngredient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] >= X) {
                    count++;
                }
            }
            if (count >= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
