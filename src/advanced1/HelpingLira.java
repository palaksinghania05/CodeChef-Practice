package advanced1;

import java.util.Scanner;

public class HelpingLira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double maxSum = 0;
        double minSum = 111111111;
        int large = 0, small = 0;
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            double area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
            maxSum = Math.max(maxSum, area);
            minSum = Math.min(area, minSum);
            if (minSum == area) {
                small = i + 1;
            }
            if (maxSum == area) {
                large = i + 1;
            }
        }
        System.out.println(small + " " + large);
    }
}
