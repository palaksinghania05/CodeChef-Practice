package advanced1;

import java.util.HashSet;
import java.util.Scanner;

public class BrokenTelephone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < N - 1; j++) {
                if (arr[j] != arr[j + 1]) {
                    set.add(j);
                    set.add(j + 1);
                }
            }
            System.out.println(set.size());
            T--;
        }
    }
}
