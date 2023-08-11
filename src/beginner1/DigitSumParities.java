package beginner1;

import java.util.Scanner;

public class DigitSumParities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long M = N;
            int sum = 0;
            while (N % 10 == 9) {
                sum++;
                N /= 10;
            }
            if (sum % 2 == 1)
                System.out.println(M + 2);
            else
                System.out.println(M + 1);
            T--;
        }
    }
}
