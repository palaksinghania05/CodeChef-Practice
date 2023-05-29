package beginner1;

import java.util.Scanner;

public class ABalancedContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int P = sc.nextInt();
            int[] arr = new int[N];
            int cakewalk = 0, hard = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] >= (P / 2))
                    cakewalk++;
                else if (arr[i] <= (P / 10))
                    hard++;
            }
            if ((cakewalk == 1) && (hard == 2))
                System.out.println("yes");
            else
                System.out.println("no");
            T--;
        }
    }
}
