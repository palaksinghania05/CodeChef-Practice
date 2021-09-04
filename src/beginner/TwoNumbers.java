package beginner;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long n = sc.nextLong();
                long c;
                long d;
                if (n % 2 != 0) {
                    c = Math.max(a * 2, b);
                    d = Math.min(a * 2, b);
                    System.out.println(c / d);
                    t--;
                } else {
                    c = Math.max(a, b);
                    d = Math.min(a, b);
                    System.out.println(c / d);
                    t--;
                }
            }
        }
    }
}