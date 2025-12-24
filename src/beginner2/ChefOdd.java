package beginner2;

import java.util.Scanner;

public class ChefOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), i;
        String result;
        while (T-- != 0) {
            long N = sc.nextLong();
            long K = sc.nextLong();
            long temp;
            result = "NO";
            if (K > N / 2) {
                System.out.println("NO");
            } else {
                if (N % 2 == 0) {
                    temp = N / 2;
                } else {
                    temp = (N + 1) / 2;
                }
                long remaining = K - temp;
                if (remaining % 2 == 0) {
                    result = "YES";
                }

                System.out.println(result);
            }
        }
    }
}
