package beginner1;

import java.util.Scanner;

public class EasyMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i; j < N; j++) {
                    if (i != j) {
                        int prod = arr[i] * arr[j];
                        int x = 0;
                        while (prod > 0) {
                            int a = prod % 10;
                            x += a;
                            prod /= 10;
                        }
                        if (x > max)
                            max = x;
                    }
                }
            }
            System.out.println(max);
            T--;
        }
    }
}
