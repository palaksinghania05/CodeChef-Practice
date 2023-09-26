package beginner;

import java.util.Scanner;

public class NaiveChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int[] arr = new int[N];
            float count1 = 0;
            float count2 = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == A)
                    count1++;
                if (arr[i] == B)
                    count2++;
            }
            float result = (count1 / N) * (count2 / N);
            System.out.println(result);
            T--;
        }
    }
}
