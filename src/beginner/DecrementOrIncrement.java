package beginner;

import java.util.Scanner;

public class DecrementOrIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt();
            if (N % 4 == 0)
                System.out.println(N + 1);
            else
                System.out.println(N - 1);
        }
    }
}
