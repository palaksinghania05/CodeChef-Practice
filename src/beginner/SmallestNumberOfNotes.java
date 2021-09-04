package beginner;

import java.util.Scanner;

public class SmallestNumberOfNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int t = sc.nextInt();
            while (t > 0) {
                int N = sc.nextInt();
                int count = 0;
                while (N != 0) {
                    if (N >= 100) {
                        N = N - 100;
                        count++;
                    } else if (N >= 50) {
                        N = N - 50;
                        count++;
                    } else if (N >= 10) {
                        N = N - 10;
                        count++;
                    } else if (N >= 5) {
                        N = N - 5;
                        count++;
                    } else if (N >= 2) {
                        N = N - 2;
                        count++;
                    } else {
                        N = N - 1;
                        count++;
                    }
                }
                System.out.println(count);
                t--;
            }
        }
    }
}
