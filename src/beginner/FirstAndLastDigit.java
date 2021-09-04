package beginner;

import java.util.Scanner;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                long n = sc.nextLong();
                long digit_count = (long) (Math.log10(n));
                long first = (long) (n / (long) (Math.pow(10, digit_count)));
                long last = n % 10;
                System.out.println(first + last);
            }
        }
    }
}
