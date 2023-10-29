package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class CoolName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String str = sc.next();
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            int sum = 0;
            for (int i = 0; i < charArray.length; i++) {
                sum += (i + 1) * (charArray[i] - 96);
            }
            System.out.println(sum);
            T--;
        }
    }
}
