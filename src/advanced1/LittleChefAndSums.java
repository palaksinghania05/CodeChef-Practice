package advanced1;

import java.util.Scanner;

public class LittleChefAndSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int temp = 0, count = 0, sum = 0;
            int temp2 = Integer.MAX_VALUE;
            for (int s = 0; s < N; s++) {
                temp = A[s] + sum;
                if (temp2 > temp) {
                    temp2 = temp;
                    count = s;
                }
            }
            System.out.println(count + 1);
            T--;
        }
    }
}
