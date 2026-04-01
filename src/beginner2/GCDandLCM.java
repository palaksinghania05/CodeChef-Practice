package beginner2;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long X = sc.nextLong();
            long Y = sc.nextLong();
            int K = sc.nextInt();
            long temp1 = Math.max(X, Y);
            long temp2 = Math.min(X, Y);
            while (temp2 != 0) {
                long temp = temp2;
                temp2 = temp1 % temp2;
                temp1 = temp;
            }
            K = K - 1;
            if (K == 0) {
                if (X > Y) {
                    X = temp1;
                } else {
                    Y = temp1;
                }
            }
            if (K >= 1) {
                X = temp1;
                Y = temp1;
            }
            System.out.println(X + Y);
        }
    }
}
