package advanced1;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            ArrayList<Character> result = new ArrayList<>();
            int temp = (int) Math.ceil((double) N / 2);
            if (X > temp) {
                System.out.println(-1);
            } else {
                char ch = 'a';
                int count = 1;
                result.add(ch);
                for (int i = 1; i <= (N - 1) / 2; i++) {
                    if (count < X) {
                        count++;
                        ch++;
                    }
                    result.add(ch);
                }
                if (N % 2 == 0) {
                    for (int i = N / 2; i < N; i++) {
                        result.add(result.get(N - 1 - i));
                    }
                } else {
                    for (int i = (N / 2) + 1; i < N; i++) {
                        result.add(result.get(N - 1 - i));
                    }
                }
                for (Character character : result) {
                    System.out.print(character);
                }
                System.out.println();
            }
            T--;
        }
    }
}
