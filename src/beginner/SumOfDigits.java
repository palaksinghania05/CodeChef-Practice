package beginner;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                long n = sc.nextLong();
                long sum = 0;
                while (n > 0) {
                    long rem = n % 10;
                    sum = sum + rem;
                    n = n / 10;
                }
                System.out.println(sum);
            }
        }
    }
}
