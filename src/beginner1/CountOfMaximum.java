package beginner1;

import java.util.Scanner;

public class CountOfMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int maxfreq = 0;
            int ele = 0;
            for (int i = 0; i < N; i++) {
                int count = 1;
                for (int j = i + 1; j < N; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > maxfreq) {
                    maxfreq = count;
                    ele = arr[i];
                } else if (count >= maxfreq && ele > arr[i]) {
                    maxfreq = count;
                    ele = arr[i];
                }
            }
            System.out.println(ele + " " + maxfreq);
            T--;
        }
    }
}
