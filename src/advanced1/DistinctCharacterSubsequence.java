package advanced1;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctCharacterSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S = sc.next();
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                set.add(ch);
            }
            System.out.println(set.size());
            T--;
        }
    }
}
