package advanced1;

import java.util.Scanner;

public class PalindromesNotAllowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            char temp = 'a';
            for (int i = 0; i < N; i++) {
                System.out.print(temp);
                temp++;
                if (temp == 'z')
                    temp = 'a';
            }
            System.out.println();
            T--;
        }
    }
}
