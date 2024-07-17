package advanced1;

import java.util.Scanner;

public class ExpensiveSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int temp1 = Math.min(Math.min(Math.min(x1, N - x1 + 1), y1), N - y1 + 1) + Math.min(Math.min(Math.min(x2, N - x2 + 1), y2), N - y2 + 1);
            int temp2 = Math.abs(x2 - x1) + Math.abs(y2 - y1);
            int result = Math.min(temp1, temp2);
            System.out.println(result);
            T--;
        }
    }
}
