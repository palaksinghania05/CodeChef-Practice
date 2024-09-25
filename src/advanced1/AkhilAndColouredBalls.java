package advanced1;

import java.util.Scanner;

public class AkhilAndColouredBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String X = sc.next();
            String Y = sc.next();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < X.length(); i++) {
                if (X.charAt(i) == Y.charAt(i)) {
                    result.append(X.charAt(i) == 'W' ? 'B' : 'W');
                } else {
                    result.append('B');
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
