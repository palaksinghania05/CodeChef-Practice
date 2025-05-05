package beginner;

import java.util.Scanner;

public class ICanUseBothHands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            int M = sc.nextInt();
            int result = (M / L) + (M / R);
            if (M % L != 0) {
                result++;
            }
            System.out.println(result);
        }
    }
}
