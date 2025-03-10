package advanced1;

import java.util.Scanner;

public class AnInterestingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int K = sc.nextInt();
            int count = 0;
            while (K % 2 == 0) {
                K /= 2;
                count++;
            }
            System.out.println(count);
        }
    }
}
