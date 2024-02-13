package advanced1;

import java.util.Scanner;

public class OpenTheDragonScroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int temp = Integer.bitCount(A), bitB = Integer.bitCount(B);
            String ans = "";
            if ((temp + bitB) <= N)
                ans = "1".repeat(temp + bitB) + "0".repeat(N - (temp + bitB));
            else
                ans = "1".repeat(2 * N - (temp + bitB)) + "0".repeat((temp + bitB) - N);
            System.out.println(Integer.parseInt(ans, 2));
            T--;
        }
    }
}
