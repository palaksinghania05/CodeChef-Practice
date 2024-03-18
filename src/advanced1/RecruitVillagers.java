package advanced1;

import java.util.Scanner;

public class RecruitVillagers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long m = sc.nextLong();
        long c = sc.nextLong();
        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0; i < N; i++) {
            long Xi = sc.nextLong();
            long Yi = sc.nextLong();
            long Pi = sc.nextLong();
            if (Yi - m * Xi - c > 0) {
                sum2 += Pi;
            }
            if (Yi - m * Xi - c < 0) {
                sum1 += Pi;
            }
        }
        System.out.println(Math.max(sum1, sum2));
    }
}
