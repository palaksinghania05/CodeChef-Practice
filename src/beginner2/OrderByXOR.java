package beginner2;

import java.util.Scanner;

public class OrderByXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long C = sc.nextLong();
            long result = 0;
            for (int i = 29; i >= 0; i--) {
                long temp1 = A ^ (result ^ (1L << i));
                long temp2 = B ^ (result ^ (1L << i));
                long temp3 = C ^ (result ^ (1L << i));
                if (temp1 < temp2 && temp2 < temp3) {
                    result ^= (1L << i);
                    break;
                } else if (temp1 < Math.min(temp2, temp3) || Math.max(temp1, temp2) < temp3) {
                    result ^= (1L << i);
                }
            }
            if ((A ^ result) < (B ^ result) && (B ^ result) < (C ^ result))
                System.out.println(result);
            else
                System.out.println(-1);
        }
    }
}
