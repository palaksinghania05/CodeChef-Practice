package beginner1;

import java.util.Scanner;

public class ChefAndSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                int ele = sc.nextInt();
                arr[j] = ele;
            }
            int count = 0;
            for (int k = 0; k < N; k++) {
                int sum = 0;
                int product = 1;
                for (int j = k; j < N; j++) {
                    sum = sum + arr[j];
                    product = product * arr[j];
                    if (sum == product) {
                        count = count + 1;
                    }
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
