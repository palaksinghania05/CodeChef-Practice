package advanced1;

import java.util.Scanner;

public class ChefAndChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S = sc.next();
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < S.length(); i++) {
                if (i % 2 == 0) {
                    if (S.charAt(i) == '-') {
                        count1++;
                    } else {
                        count2++;
                    }
                } else {
                    if (S.charAt(i) == '+') {
                        count1++;
                    } else {
                        count2++;
                    }
                }
            }
            System.out.println(Math.min(count1, count2));
            T--;
        }
    }
}
