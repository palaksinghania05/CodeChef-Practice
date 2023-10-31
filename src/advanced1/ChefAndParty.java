package advanced1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChefAndParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < arr.length; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (list.size() >= arr[i])
                    list.add(arr[i]);
            }
            System.out.println(list.size());
            T--;
        }
    }
}
