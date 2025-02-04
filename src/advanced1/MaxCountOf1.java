package advanced1;

import java.util.Scanner;

public class MaxCountOf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int result = 1, temp1 = 1;
            for (int i = 0; i < N - 1; i++) {
                int temp2 = temp1 ^ Integer.parseInt(S.substring(i, i + 1));
                if (temp2 == 1) {
                    result++;
                }
                temp1 = temp2;
            }
            System.out.println(Math.max(N - result, result));
            T--;
        }
    }
}
