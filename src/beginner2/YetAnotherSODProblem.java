package beginner2;

import java.util.Scanner;

public class YetAnotherSODProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long L = sc.nextLong();
            long R = sc.nextLong();
            long count;
            count = R / 3 - (L - 1) / 3;
            System.out.println(count);
        }
    }
}
