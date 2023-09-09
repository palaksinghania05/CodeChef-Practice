package beginner1;

import java.util.Scanner;

public class SortTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < N - 1; i++) {
                if (s.startsWith("10", i)) {
                    count++;
                    i++;
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
