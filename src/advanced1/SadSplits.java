package advanced1;

import java.util.Scanner;

public class SadSplits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int temp = N % 2 == 0 ? 0 : 1;
            boolean result = false;
            while (N > 0) {
                N = N / 10;
                if (N % 2 == temp && N > 0) {
                    result = true;
                    break;
                }
            }
            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
