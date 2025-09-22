package beginner2;

import java.util.Scanner;

public class MoneyTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long C = sc.nextLong();
            long max = (A * 100) + B;
            long result = 0, count = 0;
            while (A >= 0) {
                count++;
                if ((A == 0 && B <= C) || count >= 1000) {
                    break;
                } else if (B < C) {
                    A -= 1;
                    B += 100;
                }
                B -= C;
                long temp = A;
                A = B;
                B = temp;
                long ans = (A * 100) + B;
                if (ans > max) {
                    max = ans;
                    result = count;
                }
            }
            System.out.println(result);
        }
    }
}
