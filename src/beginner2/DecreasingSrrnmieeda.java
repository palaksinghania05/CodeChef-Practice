package beginner2;

import java.util.Scanner;

public class DecreasingSrrnmieeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            if (R >= 2 * L) {
                System.out.println(-1);
            } else {
                System.out.println(R);
            }
        }
    }
}
