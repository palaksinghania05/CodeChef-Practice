package beginner1;

import java.util.Scanner;

public class PriyaAndAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int count = 0;
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if ((arr[i] & arr[j]) == arr[i]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
