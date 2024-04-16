package advanced1;

import java.util.Scanner;

public class BeatTheAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int X = sc.nextInt();
            if (M <= X)
                System.out.println(0);
            else
                System.out.println((N * X) / (X + 1));
            T--;
        }
    }
}
