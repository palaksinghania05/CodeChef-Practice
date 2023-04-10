package beginner1;

import java.util.Scanner;

public class SimilarDishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int i = 1;
            while (true) {
                if (isPrime(x + y + i))
                    break;
                else
                    i++;
            }
            System.out.println(i);
            T--;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
