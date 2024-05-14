package advanced1;

import java.util.Scanner;

public class ExactMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            long temp1 = 3L * N;
            if (X > temp1 || X == temp1 - 1 || X == temp1 - 2 || X == temp1 - 5) {
                System.out.println("NO");
            } else {
                int temp2 = (int) Math.ceil((double) X / 3);
                System.out.println("YES");
                System.out.print(temp2 + " ");
                System.out.print((3 * temp2) - X + " ");
                System.out.print(N - (4 * temp2 - X));
                System.out.println();
            }
            T--;
        }
    }
}
