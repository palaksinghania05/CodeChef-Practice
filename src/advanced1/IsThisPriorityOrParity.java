package advanced1;

import java.util.Scanner;

public class IsThisPriorityOrParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            long K = sc.nextLong();
            if (K == 1) {
                if (N % 2 == 0) {
                    System.out.println("EVEN");
                } else {
                    System.out.println("ODD");
                }
            } else if (K == 2) {
                System.out.println("ODD");
            } else {
                System.out.println("EVEN");
            }
            T--;
        }
    }
}
