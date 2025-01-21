package advanced1;

import java.util.Scanner;

public class ChefAndSecretIngredients {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[26];
            int temp = 0;
            for (int i = 0; i < N; i++) {
                String S = sc.next();
                boolean[] flag = new boolean[26];
                for (int j = 0; j < S.length(); j++) {
                    temp = S.charAt(j) - 'a';
                    if (!flag[temp]) {
                        flag[temp] = true;
                        A[temp]++;
                    }
                }
            }
            int result = 0;
            for (int j : A) {
                if (j == N) {
                    result++;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
