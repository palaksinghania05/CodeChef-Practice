package beginner1;

import java.util.Scanner;

public class DividingStamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int totalStamps = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            totalStamps += arr[i];
        }
        int members = 0;
        for (int i = 1; i <= N; i++)
            members += i;
        if (members == totalStamps)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
