package advanced1;

import java.util.ArrayList;
import java.util.Scanner;

public class PrefixPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 1; i < N; i++) {
                arr.add(i);
            }
            result.add(N);
            int prefix = N, flag = 0;
            for (int i = 2; i <= N; i++) {
                for (int ele : arr) {
                    int val = prefix + ele;
                    if ((val % i) != 0) {
                        prefix = val;
                        result.add(ele);
                        arr.remove(Integer.valueOf(ele));
                        break;
                    }
                    if (arr.size() == 1) {
                        flag = 1;
                        System.out.println(-1);
                    }
                }
            }
            if (flag == 0) {
                for (int x : result) System.out.print(x + " ");
                System.out.println();
            }
            T--;
        }
    }
}
