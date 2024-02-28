package advanced1;

import java.util.Scanner;

public class ChefAndIcecream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int five = 0;
            int ten = 0;
            int flag = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 5) {
                    five++;
                } else if (arr[i] == 10 && five != 0) {
                    ten++;
                    five--;
                } else if (arr[i] == 15 && (five >= 2 || ten != 0)) {
                    if (ten != 0) {
                        ten--;
                    } else {
                        five = five - 2;
                    }
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            T--;
        }
    }
}
