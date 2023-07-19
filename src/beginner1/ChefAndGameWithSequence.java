package beginner1;

import java.util.Scanner;

public class ChefAndGameWithSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int count = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if ((arr[i] & 1) == 1) {
                    count++;
                }
            }
            int oddSum = (count % 2) + 1;
            int evenSum = 1;
            int totalSum = ((oddSum + evenSum) % 2) + 1;
            if (N == 1) {
                totalSum = 1;
            }
            System.out.println(totalSum);
            T--;
        }
    }
}
