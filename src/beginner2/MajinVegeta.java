package beginner2;

import java.util.Scanner;

public class MajinVegeta {
    static int noOfPrimes(int num) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
                while (num % i == 0)
                    num /= i;
            }
        }
        if (num > 1)
            count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(), M = sc.nextInt();
            long result = 0;
            for (int i = N; i < M; i++) {
                result += noOfPrimes(i);
            }
            System.out.println(result);
        }
        sc.close();
    }
}
