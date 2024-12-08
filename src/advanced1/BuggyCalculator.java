package advanced1;

import java.util.Scanner;

public class BuggyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = 1;
            int result = 0;
            while (a > 0 || b > 0) {
                result += ((a % 10 + b % 10) % 10) * temp;
                a = a / 10;
                b = b / 10;
                temp = temp * 10;
            }
            System.out.println(result);
            T--;
        }
    }
}
