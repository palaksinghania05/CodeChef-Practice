package advanced1;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S = sc.next();
            HashSet<String> set = new HashSet<>();
            int count = 0;
            for (int i = 0; i < S.length() - 1; i++) {
                String str = "" + S.charAt(i) + S.charAt(i + 1);
                if (!set.contains(str)) {
                    set.add(str);
                    count++;
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
