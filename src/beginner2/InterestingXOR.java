package beginner2;

import java.util.Scanner;

public class InterestingXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int a = 0, b = 0;
            int temp = 31 - Integer.numberOfLeadingZeros(N);
            for (int i = temp; i >= 0; i--) {
                int bit = (N >> i) & 1;
                if (bit == 0) {
                    a += 1 << i;
                    b += 1 << i;
                } else {
                    if (a < b) a += 1 << i;
                    else b += 1 << i;
                }
            }
            System.out.println((long) a * b);
        }
    }
}
