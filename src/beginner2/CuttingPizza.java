package beginner2;

import java.util.Scanner;

public class CuttingPizza {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int temp = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (i > 0)
                    temp = Math.min(temp, A[i] - A[i - 1]);
            }
            int k = gcd(360, temp);
            System.out.println((360 / k) - N);
        }
    }
}
