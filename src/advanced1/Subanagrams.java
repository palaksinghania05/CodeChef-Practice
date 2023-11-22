package advanced1;

import java.util.Scanner;

public class Subanagrams {
    public static void main(String[] args) {
        int[] alphabets = new int[26];
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            if (i == 0) {
                for (char ch : str.toCharArray()) {
                    alphabets[ch - 'a'] += 1;
                }
            } else {
                int[] curr = new int[26];
                for (char ch : str.toCharArray()) {
                    curr[ch - 'a'] += 1;
                }
                for (int j = 0; j < 26; j++) {
                    alphabets[j] = Math.min(alphabets[j], curr[j]);
                }
            }
        }
        String result = "";
        for (int i = 0; i < 26; i++) {
            if (alphabets[i] > 0) {
                int count = alphabets[i];
                while (count-- > 0) {
                    result = result + ((char) (i + 'a'));
                }
            }
        }
        result = result.equals("") ? "no such string" : result;
        System.out.println(result);
    }
}
