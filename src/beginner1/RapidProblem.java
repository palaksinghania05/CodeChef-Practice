package beginner1;

import java.util.Scanner;

public class RapidProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int max = a[0] + a[1];
            float count = 0;
            for (int i = 0; i < n - 1; i++){
                for (int j = i + 1; j < n; j++){
                    if (a[i] + a[j] == max) {
                        count++;
                    } else if (a[i] + a[j] > max) {
                        max = a[i] + a[j];
                        count = 1;
                    }
                }
            }
            float pairs = (n * (n-1)) / 2;
            System.out.println(count/pairs);
        }
    }
}
