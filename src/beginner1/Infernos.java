package beginner1;

import java.util.ArrayList;
import java.util.Scanner;

public class Infernos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            while (N > 0) {
                list.add(sc.nextInt());
                N--;
            }
            int highestHealth = java.util.Collections.max(list);
            int sum = 0;
            for (int ele : list) {
                while (ele > 0) {
                    ele = ele - X;
                    sum++;
                }
            }
            System.out.println(Math.min(sum, highestHealth));
            T--;
        }
    }
}
