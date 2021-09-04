package beginner;

import java.util.Scanner;

public class ChefAndOperators {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t > 0) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                if (A == B)
                    System.out.println("=");
                else if (A > B)
                    System.out.println(">");
                else
                    System.out.println("<");
                t--;
            }
        }
    }
}
