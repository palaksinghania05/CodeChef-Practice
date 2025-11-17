package beginner2;

import java.util.Scanner;

public class SubstringOfASubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String S = sc.next();
            int length = S.length();
            char firstChar = S.charAt(0);
            char lastChar = S.charAt(length - 1);
            int result = -1;
            int temp = 0;
            for (int i = 0; i < length; i++) {
                if (S.charAt(i) == firstChar || S.charAt(i) == lastChar)
                    temp = 0;
                else
                    temp++;
                if (temp > result)
                    result = temp;
            }
            if (result == 0)
                result--;
            System.out.println(result);
        }
    }
}
