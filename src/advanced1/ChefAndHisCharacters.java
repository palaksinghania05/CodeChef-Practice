package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndHisCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S = sc.next();
            char[] arr = {'c', 'e', 'f', 'h'};
            int count = 0;
            for (int i = 0; i < S.length() - 3; i++) {
                String str2 = S.substring(i, i + 4);
                char[] a = str2.toCharArray();
                Arrays.sort(a);
                int j;
                for (j = 0; j < 4; j++) {
                    if (a[j] != arr[j])
                        break;
                }
                if (j == 4) count++;
            }
            if (count != 0) {
                System.out.println("lovely " + count);
            } else
                System.out.println("normal");
            T--;
        }
    }
}
