package beginner;

import java.util.Scanner;

public class ValidTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int t = sc.nextInt();
            while (t > 0) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                if (A + B + C == 180)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                t--;
            }
        }
    }
}
