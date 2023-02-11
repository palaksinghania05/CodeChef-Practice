package beginner1;

import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            for (int i = m; i <= n; i++) {
                if (isPrime(i))
                    System.out.println(i);
            }
            T--;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
