package beginner1;

import java.util.Scanner;

public class MathisonAndPangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] prices = new int[26];
            for (int i = 0; i < 26; i++) {
                prices[i] = sc.nextInt();
            }
            String alphabets = "abcdefghijklmnopqrstuvwxyz";
            String inputText = sc.next();
            int result = 0;
            for (int i = 0; i < 26; i++) {
                if (!inputText.contains(String.valueOf(alphabets.charAt(i))))
                    result += prices[i];
            }
            System.out.println(result);
            T--;
        }
    }
}
