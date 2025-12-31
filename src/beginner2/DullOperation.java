package beginner2;

import java.util.Scanner;

public class DullOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            System.out.println(N + " " + --N);
        }
    }
}
