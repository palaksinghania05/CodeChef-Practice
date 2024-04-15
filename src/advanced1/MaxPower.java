package advanced1;

import java.util.Scanner;

public class MaxPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                result = N - (i + 1);
            }
        }
        System.out.println(result);
    }
}
