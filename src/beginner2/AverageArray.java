package beginner2;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int start = X - N / 2;
            int end = X + N / 2;
            for (int i = start; i < X; i++) {
                list.add(i);
            }
            for (int i = X + 1; i <= end; i++) {
                list.add(i);
            }
            if ((N & 1) == 1)
                list.add(X);
            System.out.println(list.toString().replace(",", "").replace("[", "").replace("]", ""));
        }
    }
}
