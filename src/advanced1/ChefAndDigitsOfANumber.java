package advanced1;

import java.util.Scanner;

public class ChefAndDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String N = sc.next();
            int count = 0;
            for (int i = 0; i < N.length(); i++) {
                if (N.charAt(i) == '1')
                    count++;
            }
            if ((count == (N.length() - 1)) || (count == 1))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
