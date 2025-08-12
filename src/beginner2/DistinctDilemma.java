package beginner2;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctDilemma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int temp = 0;
            int result;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                temp += arr[i];
            }
            for (int l = 1; l <= temp; l++) {
                list.add(l);
                temp = temp - l;
            }
            result = list.size();
            System.out.println(result);
        }
    }
}
