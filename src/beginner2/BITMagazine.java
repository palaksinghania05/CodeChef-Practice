package beginner2;

import java.util.Scanner;

public class BITMagazine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int temp1 = (N + 1) / 2;
            double sum = (double) (N * (N + 1)) / 2;
            int count = sc.nextInt();
            for (int i = 0; i < count; i++) {
                int ele = sc.nextInt();
                sum -= ele;
            }
            int temp2 = sc.nextInt();
            sum = (sum * (temp1 - temp2)) / temp1;
            System.out.printf("%.4f\n", sum);
        }
    }
}
