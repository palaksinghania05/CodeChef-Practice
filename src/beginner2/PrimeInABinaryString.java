package beginner2;

import java.util.Scanner;

public class PrimeInABinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String S = sc.next();
            if (S.contains("10") || S.contains("11")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
