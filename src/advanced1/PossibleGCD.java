package advanced1;

import java.util.Scanner;

public class PossibleGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int temp = Math.abs(A - B);
            int result = 0;
            for (int i = 1; i * i <= temp; i++) {
                if (temp % i == 0) {
                    result++;
                    if (i != (temp / i)) result++;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
