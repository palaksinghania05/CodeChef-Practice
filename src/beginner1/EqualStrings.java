package beginner1;

import java.util.HashSet;
import java.util.Scanner;

public class EqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            HashSet<Character> set = new HashSet<>();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (A.charAt(i) != B.charAt(i) && !set.contains(B.charAt(i))) {
                    count++;
                    set.add(B.charAt(i));
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
