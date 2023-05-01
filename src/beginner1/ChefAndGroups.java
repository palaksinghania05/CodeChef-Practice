package beginner1;

import java.util.Scanner;

public class ChefAndGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String s = sc.next().concat("0");
            int count = 0;
            for (int i = 1; i < s.length(); i++) {
                char char1 = s.charAt(i - 1);
                char char2 = s.charAt(i);
                if (char2 == '0' && char1 == '1')
                    count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
