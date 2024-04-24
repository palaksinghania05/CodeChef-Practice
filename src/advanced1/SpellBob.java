package advanced1;

import java.util.Scanner;

public class SpellBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S1 = sc.next();
            String S2 = sc.next();
            int bottom = 0, top = 0;
            boolean flag = true;
            for (int i = 0; i < S1.length(); i++) {
                if (!(S1.charAt(i) == 'o' || S1.charAt(i) == 'b' || S2.charAt(i) == 'o' || S2.charAt(i) == 'b'))
                    flag = false;
                if (S1.charAt(i) == 'o' || S2.charAt(i) == 'o')
                    top++;
                if (S1.charAt(i) == 'b' || S2.charAt(i) == 'b')
                    bottom++;
            }
            if (flag && bottom >= 2 && top >= 1)
                System.out.println("yes");
            else
                System.out.println("no");
            T--;
        }
    }
}
