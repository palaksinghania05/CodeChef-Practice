package advanced1;

import java.util.Scanner;

public class ChefAndCoupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int D = sc.nextInt();
            int C = sc.nextInt();
            int[] A = new int[3];
            int sum1 = 0;
            for (int i = 0; i < 3; i++) {
                A[i] = sc.nextInt();
                sum1 += A[i];
            }
            int[] B = new int[3];
            int sum2 = 0;
            for (int i = 0; i < 3; i++) {
                B[i] = sc.nextInt();
                sum2 += B[i];
            }
            int temp1 = 0;
            temp1 = sum1 + sum2 + D + D;
            if (sum1 < 150)
                sum1 += D;
            if (sum2 < 150)
                sum2 += D;
            int temp2 = 0;
            temp2 = sum1 + sum2 + C;
            if (temp1 > temp2)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
