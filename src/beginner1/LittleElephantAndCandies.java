package beginner1;

import java.util.Scanner;

public class LittleElephantAndCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int C = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int totalCandies = 0;
            for (int i = 0; i < N; i++) {
                totalCandies += arr[i];
            }
            if (C >= totalCandies)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
