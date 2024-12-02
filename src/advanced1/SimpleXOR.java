package advanced1;

import java.util.Scanner;

public class SimpleXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int L = sc.nextInt(), R = sc.nextInt();
            if ((L & 1) == 0) {
                System.out.println(L + " " + (L + 1) + " " + (L + 2) + " " + (L + 3));
            } else {
                if (L + 4 <= R) System.out.println((L + 1) + " " + (L + 2) + " " + (L + 3) + " " + (L + 4));
                else System.out.println(-1);
            }
            T--;
        }
    }
}
