package advanced1;

import java.util.Scanner;

public class MaximumOrMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int temp1 = 0;
            int temp2 = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    temp1++;
                } else {
                    temp2++;
                }
            }
            if (temp1 > temp2) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
            T--;
        }
    }
}
