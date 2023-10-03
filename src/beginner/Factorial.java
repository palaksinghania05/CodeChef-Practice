package beginner;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int sum = 0;
            while (N != 0) {
                sum = sum + (N / 5);
                N = N / 5;
            }
            System.out.println(sum);
            T--;
        }
    }
}
