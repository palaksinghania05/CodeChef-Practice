package beginner2;

import java.util.Scanner;

public class ChefAndNumbers {
    public static int Counter(int a) {
        int sum = 0;
        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        int temp = Math.max(N - 90 * 2, 0);
        for (int i = temp; i < N; i++) {
            int y = Counter(i);
            int z = Counter(y);
            if (i + y + z == N) {
                result++;
            }
        }
        System.out.println(result);
    }
}
