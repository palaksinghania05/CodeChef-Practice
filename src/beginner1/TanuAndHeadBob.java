package beginner1;

import java.util.Scanner;

public class TanuAndHeadBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            int yes = 0, no = 0, indian = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'Y')
                    yes++;
                else if (s.charAt(i) == 'N')
                    no++;
                else
                    indian++;
            }
            if (yes > 0)
                System.out.println("NOT INDIAN");
            else if (indian > 0)
                System.out.println("INDIAN");
            else
                System.out.println("NOT SURE");
            T--;
        }
    }
}




