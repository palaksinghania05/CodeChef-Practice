package beginner2;

import java.util.Scanner;

public class PolygonRelationship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int result = 0;
            for (int i = 0; i < N; i++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
            }
            while (N >= 3) {
                result += N;
                N /= 2;
            }
            System.out.println(result);
        }
    }
}
