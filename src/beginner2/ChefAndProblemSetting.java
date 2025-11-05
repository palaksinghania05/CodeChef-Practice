package beginner2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ChefAndProblemSetting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            boolean invalid = false, weak = false;
            int N = sc.nextInt();
            int M = sc.nextInt();
            while (N > 0) {
                String S1 = sc.next();
                String S2 = sc.next();
                if (S1.equals("correct") && !Pattern.matches("1{" + M + "}", S2))
                    invalid = true;
                else if (S1.equals("wrong") && Pattern.matches("1{" + M + "}", S2))
                    weak = true;
                N--;
            }
            if (invalid)
                System.out.println("INVALID");
            else if (weak)
                System.out.println("WEAK");
            else
                System.out.println("FINE");
        }
    }
}
