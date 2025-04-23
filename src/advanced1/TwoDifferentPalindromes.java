package advanced1;

import java.util.Scanner;

public class TwoDifferentPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            String result = "Yes";
            if (A == 1 || B == 1 || (A % 2 != 0 && B % 2 != 0)) {
                result = "No";
            }
            System.out.println(result);
        }
    }
}
