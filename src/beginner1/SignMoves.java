package beginner1;

import java.util.Scanner;

public class SignMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // int result = 0;
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(N % 2 == 0 ? N / 2 : -((N + 1) / 2));
            /*int i = sc.nextInt();
            if(result>=0)
                result -= i;
            else
                result += i;
            System.out.println(result);*/
            T--;
        }
    }
}
