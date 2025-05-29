package advanced1;

import java.util.Scanner;

public class SumOfPalindromicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            int sum = 0;
            for (int i = L; i <= R; i++) {
                StringBuilder str = new StringBuilder(String.valueOf(i));
                str.reverse();
                if ((String.valueOf(i)).equals(str.toString()))
                    sum += i;
            }
            System.out.println(sum);
        }
    }
}
