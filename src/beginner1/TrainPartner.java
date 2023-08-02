package beginner1;

import java.util.Scanner;

public class TrainPartner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            if (N % 8 == 0)
                System.out.println((N - 1) + "SL");
            else if (N % 8 == 7)
                System.out.println((N + 1) + "SU");
            else if (N % 8 == 1)
                System.out.println((N + 3) + "LB");
            else if (N % 8 == 2)
                System.out.println((N + 3) + "MB");
            else if (N % 8 == 3)
                System.out.println((N + 3) + "UB");
            else if (N % 8 == 4)
                System.out.println((N - 3) + "LB");
            else if (N % 8 == 5)
                System.out.println((N - 3) + "MB");
            else if (N % 8 == 6)
                System.out.println((N - 3) + "UB");
            T--;
        }
    }
}
