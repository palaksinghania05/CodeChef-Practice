package beginner;

import java.util.Scanner;

public class SumOrDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N1 = sc.nextInt();
            int N2 = sc.nextInt();
            if (N1 > N2)
                System.out.println(N1 - N2);
            else
                System.out.println(N1 + N2);
        }
    }
}
