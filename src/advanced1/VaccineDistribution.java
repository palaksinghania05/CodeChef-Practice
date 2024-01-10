package advanced1;

import java.util.Scanner;

public class VaccineDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int D = sc.nextInt();
            int temp1 = 0, temp2 = 0;
            int days = 0;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] <= 9 || arr[i] >= 80) {
                    temp1++;
                } else {
                    temp2++;
                }
            }
            if (temp1 % D == 0) {
                days += temp1 / D;
            } else {
                days += (temp1 / D) + 1;
            }
            if (temp2 % D == 0) {
                days += temp2 / D;
            } else {
                days += (temp2 / D) + 1;
            }
            System.out.println(days);
            T--;
        }
    }
}
