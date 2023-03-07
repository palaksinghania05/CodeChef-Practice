package beginner1;

import java.util.Scanner;

public class ChefAndSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < N; i++) {
                if (arr[i] % K == 0)
                    result.append(1);
                else
                    result.append(0);
            }
            System.out.println(result);
            T--;
        }
    }
}
