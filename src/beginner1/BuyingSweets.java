package beginner1;

import java.util.Scanner;

public class BuyingSweets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] banknotes = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                banknotes[j] = sc.nextInt();
                sum = sum + banknotes[j];
            }
            int sweets = sum / X;
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (sum - banknotes[j] >= (X * sweets)) {
                    count++;
                    break;
                }
            }
            if (count > 0) {
                System.out.println(-1);
            } else {
                System.out.println(sweets);
            }
            T--;
        }
    }
}
