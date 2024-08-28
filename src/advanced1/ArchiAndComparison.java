package advanced1;

import java.util.Scanner;

public class ArchiAndComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            if (n % 2 == 0) {
                a = Math.abs(a);
                b = Math.abs(b);
                if (a > b)
                    System.out.println(1);
                else if (a < b)
                    System.out.println(2);
                else
                    System.out.println(0);
            } else {
                if (a > b)
                    System.out.println(1);
                else if (a < b)
                    System.out.println(2);
                else
                    System.out.println(0);
            }
            T--;
        }
    }
}
