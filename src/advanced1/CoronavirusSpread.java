package advanced1;

import java.util.Scanner;

public class CoronavirusSpread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 1, max = 1, min = 100;
            for (int i = 0; i < N - 1; i++) {
                if ((arr[i + 1] - arr[i]) <= 2)
                    count++;
                else {
                    if (count > max)
                        max = count;
                    if (count < min)
                        min = count;
                    count = 1;
                }
            }
            if (count > max)
                max = count;
            if (count < min)
                min = count;
            System.out.println(min + " " + max);
            T--;
        }
    }
}
