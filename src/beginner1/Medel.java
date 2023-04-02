package beginner1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Medel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                a.add(arr[i]);
            }
            Arrays.sort(arr);
            int max = a.indexOf(arr[0]);
            int min = a.indexOf(arr[N - 1]);
            if (max < min)
                System.out.println(arr[0] + " " + arr[N - 1]);
            else
                System.out.println(arr[N - 1] + " " + arr[0]);
            T--;
        }
    }
}
