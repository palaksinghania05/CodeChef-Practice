package advanced1;

import java.util.Scanner;

public class TouristTranslations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        char[] m = sc.next().toCharArray();
        while (T > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '_') sb.append(" ");
                else if (s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '!' || s.charAt(i) == '?')
                    sb.append(s.charAt(i));
                else if (s.charAt(i) < 91) {
                    int tmp = s.charAt(i) - 'A';
                    String b = Character.toString(m[tmp]).toUpperCase();
                    sb.append(b.charAt(0));
                } else {
                    int tmp = s.charAt(i) - 'a';
                    sb.append(m[tmp]);
                }
            }
            System.out.println(sb.toString());
            T--;
        }
    }
}
