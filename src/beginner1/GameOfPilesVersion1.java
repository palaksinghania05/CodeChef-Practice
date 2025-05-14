package beginner1;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfPilesVersion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int temp = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 != 0)
                    temp++;
            }
            Arrays.sort(arr);
            if (arr[0] == 1)
                System.out.println("CHEF");
            else if (temp % 2 == 0)
                System.out.println("CHEFINA");
            else
                System.out.println("CHEF");
        }
    }
}
