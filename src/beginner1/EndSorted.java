package beginner1;

import java.util.Scanner;

public class EndSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; ++i) {
                arr[i] = sc.nextInt();
            }
            int p1 = 0;
            int p2 = 0;
            while (arr[p1++] != 1) ;
            while (arr[p2++] != N) ;
            int result = p1 + (N - 1 - p2);
            if (p1 > p2)
                result--;
            System.out.println(result);
            T--;
        }
    }
}
